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

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="IdCategory", nullable = false)
    private Long id;

    @Column(nullable = false, length = 25)
    private String Name;

    //@ManyToOne
    //@Column(nullable = false)
    //private Category IdParent;

    @Column(nullable = false)
    private Boolean MultiSelect;
}
