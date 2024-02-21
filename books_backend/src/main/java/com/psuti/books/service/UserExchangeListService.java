package com.psuti.books.service;

import com.psuti.books.dto.UserExchangeListDTO;
import com.psuti.books.model.UserExchangeList;
import com.psuti.books.repository.UserExchangeListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserExchangeListService {
    private UserExchangeListRepository userExchangeListRepository;
    public UserExchangeList create(UserExchangeListDTO dto) {
        return userExchangeListRepository.save(UserExchangeList.builder()
                        .exchangeList(dto.getExchangeList())
                        .offerlist(dto.getOfferList())
                        .trackNumber(dto.getTrackNumber())
                        //.receiving(dto.isReceiving())
                .build());
    }

    public UserExchangeList getById(Long id) {
        return userExchangeListRepository.findById(id).orElse(null);
    }

    public UserExchangeList updateFromUser(UserExchangeListDTO dto) {
        return userExchangeListRepository.save(UserExchangeList.builder()
                        .id(dto.getId())
                .exchangeList(dto.getExchangeList())
                .offerlist(dto.getOfferList())
                .trackNumber(dto.getTrackNumber())
                //.receiving(dto.isReceiving())
                .build());
    }

    public UserExchangeList updateFromAdmin(UserExchangeList udr) {
        return userExchangeListRepository.save(udr);
    }

    public void delete(Long id) {
        userExchangeListRepository.deleteById(id);
    }
}
