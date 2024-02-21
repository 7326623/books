package com.psuti.books.service;

import com.psuti.books.dto.UserMsgDTO;
import com.psuti.books.dto.WishListDTO;
import com.psuti.books.model.UserMsg;
import com.psuti.books.model.WishList;
import com.psuti.books.repository.UserMsgRepository;
import com.psuti.books.repository.WishListRepository;

import java.util.Date;

public class WishService {
    private WishListRepository wishListRepository;
    public WishList create(WishListDTO dto) {
        return wishListRepository.save(WishList.builder()
                        .user(dto.getUser())
                        .createAt(new Date())
                        .status(dto.getStatus())
                        .userAddress(dto.getUserAddress())
                .build());
    }

    public WishList getById(Long id) {
        return wishListRepository.findById(id).orElse(null);
    }

    public WishList updateFromUser(WishListDTO dto) {
        return wishListRepository.save(WishList.builder()
                .id(dto.getId())
                .user(dto.getUser())
                        .updateAt(new Date())
                .status(dto.getStatus())
                .userAddress(dto.getUserAddress())
                .build());
    }

    public WishList updateFromAdmin(WishList udr) {
        return wishListRepository.save(udr);
    }

    public void delete(Long id) {
        wishListRepository.deleteById(id);
    }
}
