package com.psuti.books.service;

import com.psuti.books.dto.BookLiteraryDTO;
import com.psuti.books.model.BookLiterary;
import com.psuti.books.repository.AutorRepository;
import com.psuti.books.repository.BookLiteraryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookLiteraryService {
    private BookLiteraryRepository bookLiteraryRepository;
    private AutorRepository autorRepository;

    public BookLiterary create(BookLiteraryDTO dto) {
        return bookLiteraryRepository.save(BookLiterary.builder()
                .autor(autorRepository.findById(dto.getAutorId()).orElse(null))
                .bookName(dto.getBookName())
                .note(dto.getNote())
                .build());
    }

    public BookLiterary getById(Long id) {
        return bookLiteraryRepository.findById(id).orElse(null);
    }

    public BookLiterary update(BookLiterary bookLiterary) {
        return bookLiteraryRepository.save(bookLiterary);
    }

    public void delete(Long id) {
        bookLiteraryRepository.deleteById(id);
    }
}
