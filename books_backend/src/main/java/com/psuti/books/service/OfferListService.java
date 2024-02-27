package com.psuti.books.service;

import com.psuti.books.dto.OfferListDTO;
import com.psuti.books.model.Category;
import com.psuti.books.model.OfferList;
import com.psuti.books.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class OfferListService {
    private OfferListRepository offerListRepository;
    private CategoryRepository categoryRepository;
    private BookLiteraryRepository bookLiteraryRepository;
    private UserRepository userRepository;
    private StatusRepository statusRepository;

    public OfferList create(OfferListDTO dto) {
        return offerListRepository.save(OfferList.builder()
                .bookLiterary(bookLiteraryRepository.findById(dto.getBookLiteraryId()).orElse(null))
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .isbn(dto.getIsbn())
                .yearPublishing(dto.getYearPublishing())
                .createAt(new Date())
                .updateAt(new Date())
                .status(statusRepository.findById(1L).orElse(null))
                .build());
    }

    public OfferList getById(Long id) {
        return offerListRepository.findById(id).orElse(null);
    }

    public List<OfferList> getAll() {
        return offerListRepository.findAll();
    }
    public OfferList update(OfferListDTO dto) {
        return offerListRepository.save(OfferList.builder()
                .id(dto.getId())
                .bookLiterary(bookLiteraryRepository.findById(dto.getBookLiteraryId()).orElse(null))
                .user(userRepository.findById(dto.getUserId()).orElse(null))
                .isbn(dto.getIsbn())
                .yearPublishing(dto.getYearPublishing())
                .updateAt(new Date())
                .status(statusRepository.findById(dto.getStatusId()).orElse(null))
                .build());
    }

    public void delete(Long id) {
        offerListRepository.deleteById(id);
    }

    public OfferList assignCategoryToOfferList(Long offerListId, Long categoryId) {
        List<Category> categoryList = null;
        OfferList offerList = offerListRepository.findById(offerListId).orElse(null);
        Category category = categoryRepository.findById(categoryId).orElse(null);
        categoryList = offerList.getCategories();
        categoryList.add(category);
        offerList.setCategories(categoryList);
        return offerListRepository.save(offerList);
    }
}
