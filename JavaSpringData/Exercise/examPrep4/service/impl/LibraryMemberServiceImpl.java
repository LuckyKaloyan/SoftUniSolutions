package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import softuni.exam.models.dto.LibraryMemberImportDto;
import softuni.exam.models.entity.LibraryMember;
import softuni.exam.repository.LibraryMemberRepository;
import softuni.exam.service.LibraryMemberService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class LibraryMemberServiceImpl implements LibraryMemberService {


    LibraryMemberRepository libraryMemberRepository;
    Gson gson;
    ValidationUtil validationUtil;
    ModelMapper modelMapper;



    private final static String FILE_PATH = "src/main/resources/files/json/library-members.json";
    public LibraryMemberServiceImpl(LibraryMemberRepository libraryMemberRepository, Gson gson, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.libraryMemberRepository = libraryMemberRepository;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
    }
    @Override
    public boolean areImported() {
        return this.libraryMemberRepository.count() > 0;
    }

    @Override
    public String readLibraryMembersFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importLibraryMembers() throws IOException {
        StringBuilder sb = new StringBuilder();
        LibraryMemberImportDto[] libraryMemberImportDtos = gson.fromJson(readLibraryMembersFileContent(), LibraryMemberImportDto[].class);
        for (LibraryMemberImportDto libraryMemberImportDto : libraryMemberImportDtos) {
            if(!validationUtil.isValid(libraryMemberImportDto) || this.libraryMemberRepository.findByPhoneNumber(libraryMemberImportDto.getPhoneNumber()).isPresent()
            || libraryMemberImportDto.getFirstName() == null || libraryMemberImportDto.getLastName()==null){
                sb.append("Invalid library member").append(System.lineSeparator());
                continue;
            }

            LibraryMember libraryMember = modelMapper.map(libraryMemberImportDto, LibraryMember.class);
            sb.append(String.format("Successfully imported library member %s - %s", libraryMemberImportDto.getFirstName(), libraryMemberImportDto.getLastName())).append(System.lineSeparator());
            libraryMemberRepository.saveAndFlush(libraryMember);





        }

        return sb.toString();
    }
}
