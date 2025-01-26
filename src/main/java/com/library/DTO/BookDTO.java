package DTO;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

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
