package com.psuti.books.dto;

import com.psuti.books.model.Category;
import com.psuti.books.model.Status;
import com.psuti.books.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserListDTO {
    private User user;
    private Status status;
    private List<Category> categories;
}
