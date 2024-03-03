package com.psuti.books.repository;

import com.psuti.books.model.OfferList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferListRepository extends JpaRepository<OfferList, Long> {
    List<OfferList> findByUserIdNot(Long userId);
    List<OfferList> findByUserId(Long userId);
}
