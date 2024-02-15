package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private int typeList;

//    @ManyToOne
//    @JoinColumn(name = "IdList", nullable = false)
//    private OfferList offerList;
//
//    @ManyToOne
//    @JoinColumn(name = "IdList", nullable = false)
//    private WishList wishList;
}
