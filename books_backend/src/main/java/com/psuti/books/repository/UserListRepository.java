package com.psuti.books.repository;

import com.psuti.books.model.UserList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface UserListRepository extends JpaRepository<UserList, Long> {
}
