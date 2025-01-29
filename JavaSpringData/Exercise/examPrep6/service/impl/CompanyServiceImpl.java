package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CompanyImportDto;
import softuni.exam.models.dto.CompanyImportRootDto;
import softuni.exam.models.entity.Company;
import softuni.exam.repository.CompanyRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.service.CompanyService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

@Service
public class CompanyServiceImpl implements CompanyService {
    private static final String FILE_PATH = "src/main/resources/files/xml/companies.xml";
    XmlParserImpl xmlParser;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    CompanyRepository companyRepository;
    CountryRepository countryRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository,CountryRepository countryRepository ,XmlParserImpl xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.companyRepository = companyRepository;
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.countryRepository = countryRepository;
    }
    @Override
    public boolean areImported() {
        return companyRepository.count() > 0;
    }

    @Override
    public String readCompaniesFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importCompanies() throws IOException, JAXBException {
        StringBuilder sb = new StringBuilder();
        CompanyImportRootDto companyImportRootDto = xmlParser.fromFile(FILE_PATH, CompanyImportRootDto.class);
        for(CompanyImportDto companyImportDto: companyImportRootDto.getCompanyImportDtos()){
            if(!validationUtil.isValid(companyImportDto) || this.companyRepository.findByName(companyImportDto.getName()).isPresent()
            || companyImportDto.getName() == null || companyImportDto.getName().isEmpty() || companyImportDto.getWebsite() == null || companyImportDto.getWebsite().isEmpty()){
                sb.append("Invalid company").append(System.lineSeparator());
                continue;
            }
            Company company = modelMapper.map(companyImportDto, Company.class);
            company.setCountry(this.countryRepository.findById(companyImportDto.getCountryId()));
            company.setDateEstablished(LocalDate.parse(companyImportDto.getDateEstablished()));
            sb.append(String.format("Successfully imported company %s - %s",companyImportDto.getName(),companyImportDto.getCountryId())).append(System.lineSeparator());
            companyRepository.saveAndFlush(company);

        }



        return sb.toString();
    }
}
