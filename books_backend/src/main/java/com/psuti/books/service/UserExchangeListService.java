package com.psuti.books.service;

import com.psuti.books.dto.UserExchangeListDTO;
import com.psuti.books.model.UserExchangeList;
import com.psuti.books.repository.ExchangeListRepository;
import com.psuti.books.repository.OfferListRepository;
import com.psuti.books.repository.UserExchangeListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserExchangeListService {
    private UserExchangeListRepository userExchangeListRepository;
    private ExchangeListRepository exchangeListRepository;
    private OfferListRepository offerListRepository;
    public UserExchangeList create(UserExchangeListDTO dto) {
        return userExchangeListRepository.save(UserExchangeList.builder()
                .exchangeList(exchangeListRepository.findById(dto.getExchangeListId()).orElse(null))
                .offerlist(offerListRepository.findById(dto.getOfferListId()).orElse(null))
                .trackNumber(dto.getTrackNumber())
                .receiving(false)
                .build());
    }

    public UserExchangeList getById(Long id) {
        return userExchangeListRepository.findById(id).orElse(null);
    }

    public UserExchangeList update(UserExchangeListDTO dto) {
        return userExchangeListRepository.save(UserExchangeList.builder()
                .id(dto.getId())
                .exchangeList(exchangeListRepository.findById(dto.getExchangeListId()).orElse(null))
                .offerlist(offerListRepository.findById(dto.getOfferListId()).orElse(null))
                .trackNumber(dto.getTrackNumber())
                .receiving(dto.isReceiving())
                .build());
    }

    public void delete(Long id) {
        userExchangeListRepository.deleteById(id);
    }
}
