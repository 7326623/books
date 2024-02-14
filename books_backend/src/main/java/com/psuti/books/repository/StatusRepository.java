package com.psuti.books.repository;

import com.psuti.books.model.Status;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface StatusRepository extends JpaRepository<Status, Long> {
}
