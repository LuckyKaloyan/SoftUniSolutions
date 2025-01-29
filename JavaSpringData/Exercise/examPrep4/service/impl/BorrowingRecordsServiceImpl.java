package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.BorrowingRecordImportDto;
import softuni.exam.models.dto.BorrowingRecordImportRootDto;
import softuni.exam.models.entity.BorrowingRecord;
import softuni.exam.models.enums.Genre;
import softuni.exam.repository.BookRepository;
import softuni.exam.repository.BorrowingRecordRepository;
import softuni.exam.repository.LibraryMemberRepository;
import softuni.exam.service.BorrowingRecordsService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

@Service
public class BorrowingRecordsServiceImpl implements BorrowingRecordsService {


    BorrowingRecordRepository borrowingRecordRepository;
    BookRepository bookRepository;
    LibraryMemberRepository libraryMemberRepository;
    XmlParserImpl xmlParser;
    ValidationUtil validationUtil;
    ModelMapper modelMapper;

    private final static String FILE_PATH = "src/main/resources/files/xml/borrowing-records.xml";

    public BorrowingRecordsServiceImpl(BorrowingRecordRepository borrowingRecordRepository, LibraryMemberRepository libraryMemberRepository, BookRepository bookRepository, XmlParserImpl xmlParser, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.borrowingRecordRepository = borrowingRecordRepository;
        this.xmlParser = xmlParser;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
        this.bookRepository = bookRepository;
        this.libraryMemberRepository = libraryMemberRepository;
    }


    @Override
    public boolean areImported() {
        if (this.borrowingRecordRepository.count() == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String readBorrowingRecordsFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importBorrowingRecords() throws JAXBException {
        StringBuilder sb = new StringBuilder();
        BorrowingRecordImportRootDto borrowingRecordImportRootDto = this.xmlParser.fromFile(FILE_PATH, BorrowingRecordImportRootDto.class);
        for (BorrowingRecordImportDto borrowingRecordImportDto : borrowingRecordImportRootDto.getBorrowingRecordImportDtos()) {
            if (!this.validationUtil.isValid(borrowingRecordImportDto) ||
                    !this.bookRepository.findByTitle(borrowingRecordImportDto.getBook().getTitle()).isPresent() ||
                    !this.libraryMemberRepository.findById(borrowingRecordImportDto.getMember().getId()).isPresent()
                    || borrowingRecordImportDto.getBorrowDate() == null
                    || borrowingRecordImportDto.getBorrowDate().isEmpty()
                    || borrowingRecordImportDto.getReturnDate() == null
                    || borrowingRecordImportDto.getReturnDate().isEmpty()) {
                sb.append("Invalid borrowing record").append(System.lineSeparator());
                continue;
            }

            BorrowingRecord borrowingRecord = this.modelMapper.map(borrowingRecordImportDto, BorrowingRecord.class);
            borrowingRecord.setBorrowDate(LocalDate.parse(borrowingRecordImportDto.getBorrowDate()));
            sb.append(String.format("Successfully imported borrowing record %s - %s", borrowingRecordImportDto.getBook().getTitle(), borrowingRecordImportDto.getBorrowDate())).append(System.lineSeparator());


        }
        return sb.toString();
    }

    @Override
    public String exportBorrowingRecords() {
        StringBuilder sb = new StringBuilder();
        List<BorrowingRecord> borrowingRecords = this.borrowingRecordRepository.findByBorrowDateBeforeOrderByBorrowDateDesc(LocalDate.parse("2021-09-10"));
        for (BorrowingRecord borrowingRecord : borrowingRecords) {
            if (borrowingRecord.getBook().getGenre() == Genre.SCIENCE_FICTION) {
                sb.append(String.format("Book title: %s\n" +
                        "*Book author: %s\n" +
                        "**Date borrowed: %s\n" +
                        "***Borrowed by: %s %s\n", borrowingRecord.getBook().getTitle(), borrowingRecord.getBook().getAuthor(), borrowingRecord.getBorrowDate().toString(), borrowingRecord.getMember().getFirstName(), borrowingRecord.getMember().getLastName()
                ));
            }
        }

        return sb.toString();
    }

}
