package com.psuti.books.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String email;
    private String userName;
    private String password;
    private byte[] avatar;
}
