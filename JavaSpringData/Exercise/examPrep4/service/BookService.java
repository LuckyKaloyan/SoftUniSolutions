package softuni.exam.service;


import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface BookService {

    boolean areImported();

    String readBooksFromFile() throws IOException;

	String importBooks() throws IOException;

}
