package com.psuti.books.service;

import com.psuti.books.dto.BookLiteraryDTO;
import com.psuti.books.model.BookLiterary;
import com.psuti.books.repository.BookLiteraryRepository;

import java.util.Date;

public class BookLiteraryService {
    private BookLiteraryRepository bookLiteraryRepository;

    public BookLiterary create(BookLiteraryDTO dto) {
        return bookLiteraryRepository.save(BookLiterary.builder()
                        .autor(dto.getAutor())
                        .bookName(dto.getBookName())
                        .note(dto.getNote())
                .build());
    }

    public BookLiterary getById(Long id) {
        return bookLiteraryRepository.findById(id).orElse(null);
    }

    public BookLiterary updateFromUser(BookLiteraryDTO dto) {
        return bookLiteraryRepository.save(BookLiterary.builder()
                .autor(dto.getAutor())
                .bookName(dto.getBookName())
                .note(dto.getNote())
                .build());
    }

    public BookLiterary updateFromAdmin(BookLiterary bookLiterary) {
        return bookLiteraryRepository.save(bookLiterary);
    }

    public void delete(Long id) {
        bookLiteraryRepository.deleteById(id);
    }
}
