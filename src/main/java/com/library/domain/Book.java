package com.library.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "livros")
public class Book {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "autor", nullable = false)
    private String author;

    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "data", nullable = false)
    private LocalDate dataDaVenda;


    public Book(String name, String author, double valor) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.author = author;
        this.valor = valor;
        this.dataDaVenda = LocalDate.now();
    }


    public Book() {
        this.dataDaVenda = LocalDate.now();
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", dataDaVenda=" + dataDaVenda +
                '}';
    }
}
