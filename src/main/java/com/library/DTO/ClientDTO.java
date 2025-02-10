package com.library.DTO;

import org.jetbrains.annotations.NotNull;

public record ClientDTO(

        @NotNull
        String name,

        @NotNull
        String address,

        @NotNull
        String birthDate
){}