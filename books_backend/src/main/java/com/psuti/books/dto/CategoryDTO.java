package com.psuti.books.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private String name;
    private Long idParent;
    private boolean multiSelect;
}
