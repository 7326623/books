package com.psuti.books.dto;

import com.psuti.books.model.User;
import lombok.Data;

@Data
public class UserAddressDTO {
    private Long id;
    private User idUser;
    private String addrIndex;
    private String addrCity;
    private String addrStreet;
    private String addrHouse;
    private String addrStructure;
    private String AddrApart;
    private boolean isDefault;
}
