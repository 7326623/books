package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IdUser", nullable = false)
    private User user;

    @Column(nullable = false)
    private Date createAt;

    @Column(nullable = false)
    private Date updateAt;

    @ManyToOne
    @JoinColumn(name = "IdStatus", nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "IdUserAddress", nullable = false)
    private UserAddress userAddress;
}
