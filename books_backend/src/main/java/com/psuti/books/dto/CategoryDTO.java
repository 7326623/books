package com.psuti.books.dto;

import com.psuti.books.model.Category;
import com.psuti.books.model.UserList;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private Category idParent;
    private boolean multiSelect;
    private List<UserList> list;
}
