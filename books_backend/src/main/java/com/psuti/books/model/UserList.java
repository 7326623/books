package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdUserList", nullable = false)
    private Long id;

    @Column (nullable = false)
    private Long TypeList;

    @ManyToOne
    @JoinColumn(name = "IdList", nullable = false)
    private OfferList OfferList;

    @ManyToOne
    @JoinColumn(name = "IdList", nullable = false)
    private WishList WishList;
}
