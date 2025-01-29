package softuni.exam.service.impl;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.JobImportDto;
import softuni.exam.models.dto.JobImportRootDto;
import softuni.exam.models.entity.Company;
import softuni.exam.models.entity.Job;
import softuni.exam.repository.CompanyRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.repository.JobRepository;
import softuni.exam.service.JobService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private static final String FILE_PATH = "src/main/resources/files/xml/jobs.xml";
    JobRepository jobRepository;
    XmlParserImpl xmlParser;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    CompanyRepository companyRepository;

    public JobServiceImpl(JobRepository jobRepository, XmlParserImpl xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil, CompanyRepository companyRepository) {
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.companyRepository = companyRepository;
        this.jobRepository = jobRepository;
    }
    @Override
    public boolean areImported() {
        return jobRepository.count() > 0;
    }

    @Override
    public String readJobsFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importJobs() throws JAXBException, IOException {
        StringBuilder sb = new StringBuilder();

        JobImportRootDto jobImportRootDto = xmlParser.fromFile(FILE_PATH, JobImportRootDto.class);
        for(JobImportDto jobImportDto: jobImportRootDto.getJobImportDtos()){
            if(!this.validationUtil.isValid(jobImportDto) || jobImportDto.getJobTitle()==null || jobImportDto.getJobTitle().isEmpty()
            || jobImportDto.getDescription().isEmpty() || jobImportDto.getDescription() == null || !this.companyRepository.findById(jobImportDto.getCompanyId()).isPresent()) {
                sb.append("Invalid job").append(System.lineSeparator());
            }

            Job job = modelMapper.map(jobImportDto, Job.class);
            job.setCompany(this.companyRepository.getById(jobImportDto.getCompanyId()));
            jobRepository.saveAndFlush(job);


            sb.append(String.format("Successfully imported company %s",jobImportDto.getJobTitle())).append(System.lineSeparator());
        }



        return sb.toString();
    }

    @Override
    public String getBestJobs() {
        StringBuilder sb = new StringBuilder();
        List<Job> bestJobs = this.jobRepository.findAllBySalaryGreaterThanAndHoursAWeekLessThanOrderBySalaryDesc(5000,30);
        for(Job job: bestJobs){
            sb.append(String.format("Job title %s\n"
                                   +"-Salary: %.2f\n"
                                   +"--Hours a week: %.2fh.",job.getTitle(),job.getSalary(),job.getHoursAWeek())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
