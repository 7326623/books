package com.psuti.books.service;


import com.psuti.books.dto.BookResponseDTO;
import com.psuti.books.model.BookResponse;
import com.psuti.books.repository.BookLiteraryRepository;
import com.psuti.books.repository.BookResponseRepository;
import com.psuti.books.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class BookResponseService {

    private BookResponseRepository bookResponseRepository;
    private BookLiteraryRepository bookLiteraryRepository;
    private UserRepository userRepository;

    public BookResponse create(BookResponseDTO dto) {
        return bookResponseRepository.save(BookResponse.builder()
                .bookLiterary(bookLiteraryRepository.findById(dto.getBookLiteraryId()).orElse(null))
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .createAt(new Date())
                .response(dto.getResponse())
                .note(dto.getNote())
                .build());
    }

    public BookResponse getById(Long id) {
        return bookResponseRepository.findById(id).orElse(null);
    }

    public BookResponse update(BookResponseDTO dto) {
        return bookResponseRepository.save(BookResponse.builder()
                .id(dto.getId())
                .bookLiterary(bookLiteraryRepository.findById(dto.getBookLiteraryId()).orElse(null))
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .response(dto.getResponse())
                .note(dto.getNote())
                .build());
    }

    public void delete(Long id) {
        bookResponseRepository.deleteById(id);
    }
}

