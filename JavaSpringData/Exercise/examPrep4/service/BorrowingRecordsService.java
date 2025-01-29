package softuni.exam.service;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public interface BorrowingRecordsService {

    boolean areImported();

    String readBorrowingRecordsFromFile() throws IOException;

	String importBorrowingRecords() throws IOException, JAXBException;

    String exportBorrowingRecords();
}
