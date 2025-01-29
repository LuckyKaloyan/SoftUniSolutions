package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.SellerImportDto;
import softuni.exam.models.entity.Seller;
import softuni.exam.repository.SaleRepository;
import softuni.exam.repository.SellerRepository;
import softuni.exam.service.SellerService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class SellerServiceImpl implements SellerService {

    private final static String FILE_PATH = "src/main/resources/files/json/sellers.json";

    SellerRepository sellerRepository;
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;

    public SellerServiceImpl(ValidationUtil validationUtil,ModelMapper modelMapper,Gson gson, SellerRepository sellerRepository) {
            this.gson = gson;
            this.modelMapper = modelMapper;
            this.validationUtil = validationUtil;
            this.sellerRepository = sellerRepository;
    }

    @Override
    public boolean areImported() {
        if(sellerRepository.count() == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String readSellersFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importSellers() throws IOException {

    StringBuilder sb = new StringBuilder();

      String fileContent = new String(Files.readAllBytes(Path.of(FILE_PATH)));
        SellerImportDto[] sellerImportDtos = gson.fromJson(fileContent, SellerImportDto[].class);
        for (SellerImportDto sellerImportDto : sellerImportDtos) {
            if(this.sellerRepository.findByLastName(sellerImportDto.getLastName()).isPresent() ||
                    !this.validationUtil.isValid(sellerImportDto) ){
                sb.append("Invalid seller").append(System.lineSeparator());
                continue;
            }


            Seller seller = new Seller();
            seller.setFirstName(sellerImportDto.getFirstName());
            seller.setLastName(sellerImportDto.getLastName());
            seller.setPersonalNumber(sellerImportDto.getPersonalNumber());
            this.sellerRepository.save(seller);
            sb.append(String.format("Successfully imported seller %s %s",sellerImportDto.getFirstName(), sellerImportDto.getLastName() )).append(System.lineSeparator());
        }



            return String.valueOf(sb);
    }
}
