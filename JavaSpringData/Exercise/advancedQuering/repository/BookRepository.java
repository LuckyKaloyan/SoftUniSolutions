package com.example.springintro.repository;

import com.example.springintro.model.entity.Book;
import com.example.springintro.model.entity.EditionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByReleaseDateAfter(LocalDate releaseDateAfter);

    List<Book> findAllByReleaseDateBefore(LocalDate releaseDateBefore);

    List<Book> findAllByAuthor_FirstNameAndAuthor_LastNameOrderByReleaseDateDescTitle(String author_firstName, String author_lastName);

    List<Book> findAllByEditionTypeAndCopiesLessThan(EditionType editionType, int i);
    List<Book> findAllByPriceLessThanOrPriceGreaterThan(BigDecimal lowerBound, BigDecimal upperBound);

    @Query("SELECT b FROM Book b WHERE NOT YEAR(b.releaseDate) = :year")
    List<Book> findBooksByReleaseDate_Year(int year);

    @Query("SELECT b FROM Book b WHERE b.releaseDate <= :date")
    List<Book> findAllBeforeReleaseDate(LocalDate date);
}
