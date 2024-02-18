package com.psuti.books.service;

import com.psuti.books.dto.AutorDTO;
import com.psuti.books.dto.ExchangeListDTO;
import com.psuti.books.model.Autor;
import com.psuti.books.model.ExchangeList;
import com.psuti.books.repository.AutorRepository;
import com.psuti.books.repository.ExchangeListRepository;

import java.util.Date;

public class ExhLService {
    private ExchangeListRepository exchangeListRepository;
    public ExchangeList create(ExchangeListDTO dto) {
        return exchangeListRepository.save(ExchangeList.builder()
                        .offerList1(dto.getOfferList1())
                        .wishList1(dto.getWishList1())
                        .offerList2(dto.getOfferList2())
                        .wishList2(dto.getWishList2())
                        .createAt(new Date())
                        .isBoth() // хъ что тут
                .build());
    }

    public ExchangeList getById(Long id) {
        return exchangeListRepository.findById(id).orElse(null);
    }

    public ExchangeList updateFromUser(ExchangeListDTO dto) {
        return exchangeListRepository.save(ExchangeList.builder()
                        .id(dto.getId())
                .offerList1(dto.getOfferList1())
                .wishList1(dto.getWishList1())
                .offerList2(dto.getOfferList2())
                .wishList2(dto.getWishList2())

                .isBoth() // хъ что тут
                .build());
    }

    public ExchangeList updateFromAdmin(ExchangeList exchl) {
        return exchangeListRepository.save(exchl);
    }

    public void delete(Long id) {
        exchangeListRepository.deleteById(id);
    }
}
