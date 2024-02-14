package com.psuti.books.repository;

import com.psuti.books.model.OfferList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface OfferListRepository extends JpaRepository<OfferList, Long> {
}
