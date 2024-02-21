package com.psuti.books.service;

import com.psuti.books.dto.StatusDTO;
import com.psuti.books.dto.UserAddressDTO;
import com.psuti.books.model.Status;
import com.psuti.books.model.UserAddress;
import com.psuti.books.repository.StatusRepository;
import com.psuti.books.repository.UserAddressRepository;

public class UserAddrService {
    private UserAddressRepository userAddressRepository;
    public UserAddress create(UserAddressDTO dto) {
        return userAddressRepository.save(UserAddress.builder()
                        .user(dto.getIdUser())
                        .addrIndex(dto.getAddrIndex())
                        .addrCity(dto.getAddrCity())
                        .addrStreet(dto.getAddrStreet())
                        .addrHouse(dto.getAddrHouse())
                        .AddrStructure(dto.getAddrStructure())
                        .AddrApart(dto.getAddrApart())
                        //.isDefault(dto.isDefault())
                .build());
    }

    public UserAddress getById(Long id) {
        return userAddressRepository.findById(id).orElse(null);
    }

    public UserAddress updateFromUser(UserAddressDTO dto) {
        return userAddressRepository.save(UserAddress.builder()
                        .id(dto.getId())
                .user(dto.getIdUser())
                .addrIndex(dto.getAddrIndex())
                .addrCity(dto.getAddrCity())
                .addrStreet(dto.getAddrStreet())
                .addrHouse(dto.getAddrHouse())
                .AddrStructure(dto.getAddrStructure())
                .AddrApart(dto.getAddrApart())
                //.isDefault(dto.isDefault())
                .build());

    }

    public UserAddress updateFromAdmin(UserAddress udr) {
        return userAddressRepository.save(udr);
    }

    public void delete(Long id) {
        userAddressRepository.deleteById(id);
    }
}