package com.psuti.books.service;


import com.psuti.books.dto.BookResponseDTO;
import com.psuti.books.model.BookResponse;
import com.psuti.books.repository.BookResponseRepository;

import java.util.Date;

public class BookResponseService {

    private BookResponseRepository bookResponseRepository;

    public BookResponse create(BookResponseDTO dto) {
        return bookResponseRepository.save(BookResponse.builder()
                        .bookLiterary(dto.getBookLiterary())
                        .user(dto.getUser())
                .createAt(new Date())
                        .response(dto.getResponse())
                        .note(dto.getNote())

                .build());
    }

    public BookResponse getById(Long id) {
        return bookResponseRepository.findById(id).orElse(null);
    }

    public BookResponse updateFromUser(BookResponseDTO dto) {
        return bookResponseRepository.save(BookResponse.builder()
                .bookLiterary(dto.getBookLiterary())
                .user(dto.getUser())
                .createAt(new Date())
                .response(dto.getResponse())
                .note(dto.getNote())

                .build());
    }

    public BookResponse updateFromAdmin(BookResponse bookResponse) {
        return bookResponseRepository.save(bookResponse);
    }

    public void delete(Long id) {
        bookResponseRepository.deleteById(id);
    }
}

