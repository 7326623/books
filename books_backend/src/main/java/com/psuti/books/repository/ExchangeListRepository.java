package com.psuti.books.repository;

import com.psuti.books.model.ExchangeList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface ExchangeListRepository extends JpaRepository<ExchangeList, Long> {
}
