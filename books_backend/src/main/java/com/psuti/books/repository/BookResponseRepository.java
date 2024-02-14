package com.psuti.books.repository;

import com.psuti.books.model.BookResponse;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface BookResponseRepository extends JpaRepository<BookResponse, Long> {
}
