package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class UserMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdUserMsg", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "IdUser", nullable = false)
    private User User;

    @Column(nullable = false)
    private Date CreateAt;

    @Column(nullable = false, length = 250)
    private String Text;

    @Column(length = 150)
    private String Notes;

    @ManyToOne
    @JoinColumn(name = "IdStatus", nullable = false)
    private Status Status;

    @Column (nullable = false)
    private Long Type;



}
