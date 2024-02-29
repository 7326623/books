package com.psuti.books.repository;

import com.psuti.books.model.ExchangeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeListRepository extends JpaRepository<ExchangeList, Long> {
}