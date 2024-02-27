package com.psuti.books.service;

import com.psuti.books.dto.ExchangeListDTO;
import com.psuti.books.model.ExchangeList;
import com.psuti.books.repository.ExchangeListRepository;
import com.psuti.books.repository.OfferListRepository;
import com.psuti.books.repository.WishListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class ExchangeListService {
    private ExchangeListRepository exchangeListRepository;
    private OfferListRepository offerListRepository;
    private WishListRepository wishListRepository;
    public ExchangeList create(ExchangeListDTO dto) {
        return exchangeListRepository.save(ExchangeList.builder()
                .offerList1(offerListRepository.findById(dto.getOfferList1id()).orElse(null))
                .wishList1(wishListRepository.findById(dto.getWishList1id()).orElse(null))
                .offerList2(offerListRepository.findById(dto.getOfferList2id()).orElse(null))
                .wishList2(wishListRepository.findById(dto.getWishList2id()).orElse(null))
                .createAt(new Date())
                .isBoth(dto.isBoth())
                .build());
    }

    public ExchangeList getById(Long id) {
        return exchangeListRepository.findById(id).orElse(null);
    }

    public ExchangeList update(ExchangeListDTO dto) {
        return exchangeListRepository.save(ExchangeList.builder()
                .offerList1(offerListRepository.findById(dto.getOfferList1id()).orElse(null))
                .wishList1(wishListRepository.findById(dto.getWishList1id()).orElse(null))
                .offerList2(offerListRepository.findById(dto.getOfferList2id()).orElse(null))
                .wishList2(wishListRepository.findById(dto.getWishList2id()).orElse(null))
                .isBoth(dto.isBoth())
                .build());
    }

    public void delete(Long id) {
        exchangeListRepository.deleteById(id);
    }
}
