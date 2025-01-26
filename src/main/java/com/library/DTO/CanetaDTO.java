package com.library.DTO;


import org.jetbrains.annotations.NotNull;


import java.util.UUID;

public record CanetaDTO(
        @NotNull
        UUID id,

        @NotNull
        String name,

        @NotNull
        String color,

        @NotNull
        Double valor,

        @NotNull
        int quantity
) {}
