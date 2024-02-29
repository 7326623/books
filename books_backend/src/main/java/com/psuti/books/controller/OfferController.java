package com.psuti.books.controller;

import com.psuti.books.security.UserPrincipal;
import com.psuti.books.service.OfferService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/offers")
public class OfferController {
    private final OfferService offerService;

    @GetMapping
    public ResponseEntity<Object> getOffers(@AuthenticationPrincipal UserPrincipal principal) {
        return new ResponseEntity<>(offerService.get(principal), HttpStatus.OK);
    }
}
