package com.psuti.books.repository;

import com.psuti.books.model.WishList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface WishListRepository extends JpaRepository<WishList, Long> {
}
