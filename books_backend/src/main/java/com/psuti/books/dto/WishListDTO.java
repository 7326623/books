package com.psuti.books.dto;

import lombok.Data;

@Data
public class WishListDTO {
    private Long id;
    private Long userId;
    private Long statusId;
    private Long userAddressId;
}
