package com.psuti.books.repository;

import com.psuti.books.model.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface UserRepository extends JpaRepository<User, Long> {
}
