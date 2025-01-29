package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.BookImportDto;
import softuni.exam.models.entity.Book;
import softuni.exam.repository.BookRepository;
import softuni.exam.service.BookService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class BookServiceImpl implements BookService {

    private final static String FILE_PATH = "src/main/resources/files/json/books.json";

    ModelMapper modelMapper;
    Gson gson;
    ValidationUtil validationUtil;
    BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository, Gson gson, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
    }


    @Override
    public boolean areImported() {
        if (this.bookRepository.count() == 0) {
            return false;
        }else {return true;}
    }

    @Override
    public String readBooksFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importBooks() throws IOException {
        StringBuilder sb = new StringBuilder();
        BookImportDto[] bookDtos = gson.fromJson(readBooksFromFile(), BookImportDto[].class);
        for (BookImportDto bookDto : bookDtos) {
            if(!validationUtil.isValid(bookDto) || this.bookRepository.findByTitle(bookDto.getTitle()).isPresent()
            || bookDto.getTitle()==null || bookDto.getTitle().isEmpty() || bookDto.getDescription()==null || bookDto.getDescription().isEmpty()){
                sb.append("Invalid book").append(System.lineSeparator());
                continue;
            }

            Book book = this.modelMapper.map(bookDto, Book.class);
            sb.append(String.format("Successfully imported book %s - %s",  book.getAuthor(),book.getTitle())).append(System.lineSeparator());
            this.bookRepository.saveAndFlush(book);

        }



        return sb.toString();
    }
}
