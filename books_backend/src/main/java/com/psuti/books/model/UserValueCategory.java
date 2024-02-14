package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class UserValueCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdUserValueCategory", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "IdUserList", nullable = false)
    private UserList UserList;

    @OneToOne
    @JoinColumn (name = "IdCategory", nullable = false)
    private Category Category;

}
