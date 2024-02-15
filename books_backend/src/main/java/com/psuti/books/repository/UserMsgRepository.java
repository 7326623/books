package com.psuti.books.repository;

import com.psuti.books.model.UserMsg;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMsgRepository extends JpaRepository<UserMsg, Long> {
}
