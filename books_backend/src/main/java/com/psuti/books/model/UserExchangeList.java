package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class UserExchangeList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdUserExchangeList", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn (name = "IdExchangeList", nullable = false)
    private ExchangeList ExchangeList;

    @OneToOne
    @JoinColumn (name = "IdOfferList", nullable = false)
    private OfferList Offerlist;

    @Column (length = 14)
    private String TrackNumber;

    @Column (nullable = false)
    private Boolean Receiving;


}
