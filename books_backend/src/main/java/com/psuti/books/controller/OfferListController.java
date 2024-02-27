package com.psuti.books.controller;

import com.psuti.books.dto.OfferListDTO;
import com.psuti.books.model.OfferList;
import com.psuti.books.service.OfferListService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/offer-list")
public class OfferListController {
    private final OfferListService offerListService;

    @GetMapping
    public ResponseEntity<List<OfferList>> getAllOfferList() {
        return new ResponseEntity<>(offerListService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OfferList> createOfferList(@RequestBody OfferListDTO dto) {
        return new ResponseEntity<>(offerListService.create(dto), HttpStatus.OK);
    }

    @PutMapping("/{offerListId}/category/{categoryId}")
    public ResponseEntity<OfferList> assignCategoryToOfferList(@PathVariable Long offerListId,
        @PathVariable Long categoryId) {
        return new ResponseEntity<>(offerListService.assignCategoryToOfferList(offerListId, categoryId), HttpStatus.OK);
    }
}
