package com.library.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "canetas")
public class CanetaJava {

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

    public CanetaJava(String name, String color, double valor) {
        this.name = name;
        this.color = color;
        this.valor = valor;
    }

    public CanetaJava() {}

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", cor='" + color + '\'' +
                ", valor=" + valor +
                '}';
    }

}