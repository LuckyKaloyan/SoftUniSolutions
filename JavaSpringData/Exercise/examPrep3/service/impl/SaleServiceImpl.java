package softuni.exam.service.impl;


import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.SaleImportDto;
import softuni.exam.models.entity.Sale;
import softuni.exam.repository.SaleRepository;
import softuni.exam.repository.SellerRepository;
import softuni.exam.service.SaleService;
import softuni.exam.util.ValidationUtil;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SaleServiceImpl implements SaleService {

    SaleRepository saleRepository;
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    private static final String FILE_PATH = "src/main/resources/files/json/sales.json";
    SellerRepository sellerRepository;


   public SaleServiceImpl(SaleRepository saleRepository, Gson gson, ModelMapper modelMapper, ValidationUtil validationUtil, SellerRepository sellerRepository) {
       this.saleRepository = saleRepository;
       this.gson = gson;
       this.modelMapper = modelMapper;
       this.validationUtil = validationUtil;
       this.sellerRepository = sellerRepository;
   }
    @Override
    public boolean areImported() {
        if(saleRepository.count() == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String readSalesFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importSales() throws IOException {
        StringBuilder sb = new StringBuilder();

        String fileContent = new String(Files.readAllBytes(Path.of(FILE_PATH)));
        SaleImportDto[] saleImportDtos = gson.fromJson(fileContent, SaleImportDto[].class);

        for (SaleImportDto saleImportDto : saleImportDtos) {
            if (!this.validationUtil.isValid(saleImportDto)
                    || this.saleRepository.findByNumber(saleImportDto.getNumber()).isPresent()
                    || saleImportDto.getNumber() == null
                    || saleImportDto.getNumber().length() != 7
                   ) {
                sb.append("Invalid sale").append(System.lineSeparator());
                continue;
            }
            Sale sale = new Sale();
            sale.setNumber(saleImportDto.getNumber());
            sale.setDiscounted(saleImportDto.isDiscounted());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            LocalDateTime dateTime = LocalDateTime.parse(saleImportDto.getSaleDate(), formatter);
            sale.setSaleDate(dateTime);
            sale.setSeller(this.sellerRepository.getById(saleImportDto.getSeller()));
            this.saleRepository.saveAndFlush(sale);

            System.out.println(String.format("Successfully imported sale with number %s", saleImportDto.getNumber()));
            sb.append(String.format("Successfully imported sale with number %s", saleImportDto.getNumber()))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }

}
