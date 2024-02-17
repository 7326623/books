package com.psuti.books.dto;

import com.psuti.books.model.Status;
import com.psuti.books.model.User;
import lombok.Data;

@Data
public class UserMsgDTO {
    private Long id;
    private User user;
    private String text;
    private String notes;
    private Status status;
    private int type;
}
