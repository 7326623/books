package com.psuti.books.dto;

import com.psuti.books.model.Autor;
import lombok.Data;

@Data
public class BookLiteraryDTO {
    private Long id;
    private Autor autor;
    private String bookName;
    private String note;
}
