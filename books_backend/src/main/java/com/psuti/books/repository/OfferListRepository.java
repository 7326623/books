package com.psuti.books.repository;

import com.psuti.books.model.OfferList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferListRepository extends JpaRepository<OfferList, Long> {
}
