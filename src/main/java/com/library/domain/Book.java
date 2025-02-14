package com.library.domain;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Builder
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livros")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "autor", nullable = false)
    private String author;

    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "quantity", nullable = false, columnDefinition = "integer default 0")
    private int quantity;

}
