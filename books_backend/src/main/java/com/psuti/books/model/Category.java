package com.psuti.books.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 25)
    private String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Category idParent;

    @Column(nullable = false)
    private boolean multiSelect = false;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name="category_list",
            joinColumns=  @JoinColumn(name="category_id", referencedColumnName="id"),
            inverseJoinColumns= @JoinColumn(name="list_id", referencedColumnName="id") )
    private List<UserList> list;
}
