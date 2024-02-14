package com.psuti.books.repository;

import com.psuti.books.model.Category;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
