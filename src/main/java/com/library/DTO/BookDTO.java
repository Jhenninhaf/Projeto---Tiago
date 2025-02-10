package com.library.DTO;


import org.jetbrains.annotations.NotNull;

public record BookDTO(

        @NotNull
        String name,

        @NotNull
        String author,

        @NotNull
        Double valor,

        @NotNull
        int quantity
) {}

