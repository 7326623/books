package com.psuti.books.service;

import com.psuti.books.dto.UserAddressDTO;
import com.psuti.books.model.UserAddress;
import com.psuti.books.repository.UserAddressRepository;
import com.psuti.books.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserAddressService {
    private UserAddressRepository userAddressRepository;
    private UserRepository userRepository;
    public UserAddress create(UserAddressDTO dto) {
        return userAddressRepository.save(UserAddress.builder()
                .user(userRepository.findById(dto.getIdUser()).orElse(null))
                .addrIndex(dto.getAddrIndex())
                .addrCity(dto.getAddrCity())
                .addrStreet(dto.getAddrStreet())
                .addrHouse(dto.getAddrHouse())
                .AddrStructure(dto.getAddrStructure())
                .AddrApart(dto.getAddrApart())
                .isDefault(dto.isDefault())
                .build());
    }

    public UserAddress getById(Long id) {
        return userAddressRepository.findById(id).orElse(null);
    }

    public UserAddress update(UserAddressDTO dto) {
        return userAddressRepository.save(UserAddress.builder()
                .id(dto.getId())
                .user(userRepository.findById(dto.getIdUser()).orElse(null))
                .addrIndex(dto.getAddrIndex())
                .addrCity(dto.getAddrCity())
                .addrStreet(dto.getAddrStreet())
                .addrHouse(dto.getAddrHouse())
                .AddrStructure(dto.getAddrStructure())
                .AddrApart(dto.getAddrApart())
                .isDefault(dto.isDefault())
                .build());

    }

    public void delete(Long id) {
        userAddressRepository.deleteById(id);
    }
}