package com.psuti.books.dto;

import com.psuti.books.model.Autor;
import lombok.Data;

@Data
public class BookLiteraryDTO {
    private Autor autor;
    private String bookName;
    private String note;
    }