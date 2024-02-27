package com.psuti.books.repository;

import com.psuti.books.model.UserExchangeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserExchangeListRepository extends JpaRepository<UserExchangeList, Long> {
}
