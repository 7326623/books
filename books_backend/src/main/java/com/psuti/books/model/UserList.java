package com.psuti.books.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserList {
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

    @ManyToMany
    @JoinTable(name="category_list",
            joinColumns=  @JoinColumn(name="list_id", referencedColumnName="id"),
            inverseJoinColumns= @JoinColumn(name="category_id", referencedColumnName="id") )
    private List<Category> categories;
}
