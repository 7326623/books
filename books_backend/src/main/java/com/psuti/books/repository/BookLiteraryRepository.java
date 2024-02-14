package com.psuti.books.repository;

import com.psuti.books.model.BookLiterary;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface BookLiteraryRepository extends JpaRepository<BookLiterary, Long> {
}
