package com.example.springintro;

import com.example.springintro.model.entity.Book;
import com.example.springintro.model.entity.EditionType;
import com.example.springintro.service.AuthorService;
import com.example.springintro.service.BookService;
import com.example.springintro.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final CategoryService categoryService;
    private final AuthorService authorService;
    private final BookService bookService;

    public CommandLineRunnerImpl(CategoryService categoryService, AuthorService authorService, BookService bookService) {
        this.categoryService = categoryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse("12-04-1992", formatter);
        printBooksBeforeDate(date);
    }

    private void printBooksBeforeDate(LocalDate date) {
        List<Book> books = bookService.findAllBeforeReleaseDate(date);
        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getEditionType() + " " + book.getPrice());
        }
    }


    private void printTitlesOfNotGivenYear(int i) {
       List<Book> books = bookService.findBooksByReleaseDate_Year(i);
       books.forEach(book -> System.out.println(book.getTitle()));
    }


    private void printBooksAndPricesLowerThanMoreThan(BigDecimal lower, BigDecimal higher) {
        List<Book> books = bookService.findAllByPriceLessThanOrPriceGreaterThan(lower,higher);
        books.forEach(book -> System.out.println(book.getTitle()+" - $"+book.getPrice()));
    }

    private void printTitlesOfGoldenBooksWithLessThan5000Copies() {
        List<String> GoldenBooks5000 = bookService.findAllByEditionTypeAndCopiesLessThan(EditionType.GOLD,5000);
        GoldenBooks5000.forEach(System.out::println);

    }


}
