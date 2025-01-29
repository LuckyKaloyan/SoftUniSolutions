package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.validation.constraints.Positive;

public class BookImportDto {

    @Expose
    @Length(min = 3, max = 40)
    private String author;
    @Expose
    private boolean available;
    @Expose
    @Length(min = 5)
    private String description;
    @Expose
    private String genre;
    @Expose
    @Length(min = 3, max = 40)
    private String title;
    @Expose
    @Positive
    private double rating;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
