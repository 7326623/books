package com.psuti.books.service;

import com.psuti.books.dto.CategoryDTO;
import com.psuti.books.model.Category;
import com.psuti.books.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    public Category create(CategoryDTO dto) {
        return categoryRepository.save(Category.builder()


                .build());
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category updateFromUser(CategoryDTO dto) {
        return categoryRepository.save(Category.builder()
                .id(dto.getId())


                .build());
    }

    public Category updateFromAdmin(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}

