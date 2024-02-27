package com.psuti.books.service;

import com.psuti.books.dto.WishListDTO;
import com.psuti.books.model.WishList;
import com.psuti.books.repository.StatusRepository;
import com.psuti.books.repository.UserAddressRepository;
import com.psuti.books.repository.UserRepository;
import com.psuti.books.repository.WishListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class WishListService {
    private WishListRepository wishListRepository;
    private UserRepository userRepository;
    private StatusRepository statusRepository;
    private UserAddressRepository userAddressRepository;
    public WishList create(WishListDTO dto) {
        return wishListRepository.save(WishList.builder()
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .createAt(new Date())
                .status(statusRepository.findById(dto.getStatusId()).orElse(null))
                .userAddress(userAddressRepository.findById(dto.getUserAddressId()).orElse(null))
                .build());
    }

    public WishList getById(Long id) {
        return wishListRepository.findById(id).orElse(null);
    }

    public WishList update(WishListDTO dto) {
        return wishListRepository.save(WishList.builder()
                .id(dto.getId())
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .status(statusRepository.findById(dto.getStatusId()).orElse(null))
                .userAddress(userAddressRepository.findById(dto.getUserAddressId()).orElse(null))
                .build());
    }

    public void delete(Long id) {
        wishListRepository.deleteById(id);
    }
}
