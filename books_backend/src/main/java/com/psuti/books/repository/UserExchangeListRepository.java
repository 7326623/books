package com.psuti.books.repository;

import com.psuti.books.model.UserExchangeList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface UserExchangeListRepository extends JpaRepository<UserExchangeList, Long> {
}
