package com.inventory.management.book.request;


import com.inventory.management.book.validation.DateFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
public class CreateBookRequest {
    @NotBlank(message = "The book title must be provided.")
    private String title;

    @NotBlank(message = "The book author must be provided.")
    private String author;

    @NotBlank(message = "The book genre must be provided.")
    private String genre;

    @NotBlank(message = "The book publication date must be provided.")
    @DateFormat
    private String publicationDate;

    @NotBlank(message = "The book ISBN must be provided.")
    @Pattern(
            regexp = "^([0-9]{10}|[0-9]{13})$",
            message = "The ISBN must be either 10 digits or 13 digits."
    )
    private String isbn;

}
