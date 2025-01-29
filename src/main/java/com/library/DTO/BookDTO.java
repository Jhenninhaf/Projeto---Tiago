package com.library.DTO;


import org.antlr.v4.runtime.misc.NotNull;

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

// TODO - Remover esse import, quero o @NotNull com outro import