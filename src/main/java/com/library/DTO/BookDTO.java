package DTO;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public record BookDTO(
        UUID id,

        @NotNull
        String name,

        @NotNull
        String author,

        @NotNull
        double valor,

        @NotNull
        int quantity
) {}
