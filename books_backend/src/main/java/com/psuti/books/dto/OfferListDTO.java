package com.psuti.books.dto;

import com.psuti.books.model.BookLiterary;
import com.psuti.books.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class OfferListDTO {
    private Long id;
    private BookLiterary bookLiterary;
    private User user;
    private String isbn;
    private Date yearPublishing;
}
