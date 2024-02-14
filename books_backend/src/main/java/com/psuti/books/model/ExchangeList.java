package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import java.util.Date;

public class ExchangeList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdExchangeList", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "IdOfferList1", nullable = false)
    private OfferList OfferList1;

    @OneToOne
    @JoinColumn(name = "IdWishList1", nullable = false)
    private WishList WishList1;

    @OneToOne
    @JoinColumn(name = "IdOfferList2", nullable = false)
    private OfferList OfferList2;

    @OneToOne
    @JoinColumn(name = "IdWishList2", nullable = false)
    private WishList WishList2;

    @Column(nullable = false)
    private Date CreateAt;

    @Column(nullable = false)
    private boolean IsBoth;


}

