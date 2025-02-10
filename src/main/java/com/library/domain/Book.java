package com.library.domain;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
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

    public Book(String name, String author, double valor, int quantity) {
        this.name = name;
        this.author = author;
        this.valor = valor;
        this.quantity = quantity;
    }

    public Book() {}

    public Book(UUID id, String name, String author, double valor, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.valor = valor;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", autor='" + author + '\'' +
                ", valor=" + valor +
                ", quantity=" + quantity +
                '}';
    }
}
