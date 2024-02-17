package com.psuti.books.dto;

import com.psuti.books.model.Status;
import com.psuti.books.model.User;
import com.psuti.books.model.UserAddress;
import lombok.Data;

@Data
public class WishListDTO {
    private Long id;
    private User user;
    private Status status;
    private UserAddress userAddress;
}
