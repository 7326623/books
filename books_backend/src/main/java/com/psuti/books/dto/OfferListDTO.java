package com.psuti.books.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OfferListDTO {
    private Long id;
    private Long bookLiteraryId;
    private Long userId;
    private String isbn;
    private Date yearPublishing;
    private Long statusId;
}
