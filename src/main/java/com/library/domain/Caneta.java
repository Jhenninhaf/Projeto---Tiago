package com.library.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "canetas")
public class Caneta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "cor", nullable = false)
    private String color;

    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "quantidade", nullable = false, columnDefinition = "integer default 0")
    private int quantity;

}
