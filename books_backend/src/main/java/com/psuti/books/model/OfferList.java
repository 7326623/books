package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfferList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    @JoinColumn(name = "IdBookLiterary", nullable = false)
    private List<BookLiterary> bookLiterary;

    @ManyToOne
    @JoinColumn(name = "IdUser", nullable = false)
    private User user;

    @Column(name = "ISBN", length = 13)
    private String isbn;

    @Column(nullable = false)
    private Date yearPublishing;

    @Column(nullable = false)
    private Date createAt;

    @Column(nullable = false)
    private Date updateAt;

    @ManyToOne
    @JoinColumn(name = "IdStatus", nullable = false)
    private Status status;
}
