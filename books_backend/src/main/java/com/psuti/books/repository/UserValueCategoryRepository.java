package com.psuti.books.repository;

import com.psuti.books.model.UserValueCategory;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface UserValueCategoryRepository extends JpaRepository<UserValueCategory, Long> {
}
