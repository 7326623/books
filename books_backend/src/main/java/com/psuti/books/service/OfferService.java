package com.psuti.books.service;

import com.psuti.books.dto.ExchangeListDTO;
import com.psuti.books.dto.OfferListDTO;
import com.psuti.books.model.BookLiterary;
import com.psuti.books.model.ExchangeList;
import com.psuti.books.model.OfferList;
import com.psuti.books.repository.ExchangeListRepository;
import com.psuti.books.repository.OfferListRepository;

import java.util.Date;
import java.util.List;

public class OfferService {
    private OfferListRepository offerListRepository;
    public OfferList create(OfferListDTO dto) {
        return offerListRepository.save(OfferList.builder()
                        .bookLiterary((List<BookLiterary>) dto.getBookLiterary())
                        .user(dto.getUser())
                        .isbn(dto.getIsbn())
                        .yearPublishing(dto.getYearPublishing())
                .build());
    }

    public OfferList getById(Long id) {
        return offerListRepository.findById(id).orElse(null);
    }

    public OfferList updateFromUser(OfferListDTO dto) {
        return offerListRepository.save(OfferList.builder()
                .id(dto.getId())
                .bookLiterary((List<BookLiterary>) dto.getBookLiterary())
                .user(dto.getUser())
                .isbn(dto.getIsbn())
                .yearPublishing(dto.getYearPublishing())
                .build());
    }

    public OfferList updateFromAdmin(OfferList ofr) {
        return offerListRepository.save(ofr);
    }

    public void delete(Long id) {
        offerListRepository.deleteById(id);
    }
}
