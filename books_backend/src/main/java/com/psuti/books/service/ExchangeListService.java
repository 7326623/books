package com.psuti.books.service;

import com.psuti.books.dto.ExchangeListDTO;
import com.psuti.books.model.ExchangeList;
import com.psuti.books.repository.ExchangeListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ExchangeListService {
    private ExchangeListRepository exchangeListRepository;
    public ExchangeList create(ExchangeListDTO dto) {
        return exchangeListRepository.save(ExchangeList.builder()
                        .offerList1(dto.getOfferList1())
                        .wishList1(dto.getWishList1())
                        .offerList2(dto.getOfferList2())
                        .wishList2(dto.getWishList2())
                        .createAt(new Date())
                        .isBoth(dto.isBoth())
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
                .isBoth(dto.isBoth())
                .build());
    }

    public ExchangeList updateFromAdmin(ExchangeList exchl) {
        return exchangeListRepository.save(exchl);
    }

    public void delete(Long id) {
        exchangeListRepository.deleteById(id);
    }
}
