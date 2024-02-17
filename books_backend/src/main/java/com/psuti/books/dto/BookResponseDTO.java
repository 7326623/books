package com.psuti.books.dto;

import com.psuti.books.model.BookLiterary;
import com.psuti.books.model.User;
import lombok.Data;

@Data
public class BookResponseDTO {
    private Long id;
    private BookLiterary bookLiterary;
    private User user;
    private String response;
    private String note;
}
