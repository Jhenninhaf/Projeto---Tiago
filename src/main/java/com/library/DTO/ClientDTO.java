package com.library.DTO;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public record ClientDTO(

        @NotNull
        String login,

        @NotNull
        String password
) {
        private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d).+$");

        public ClientDTO {
                if (!PASSWORD_PATTERN.matcher(password).matches()) {
                        throw new IllegalArgumentException("A senha deve conter pelo menos uma letra e um número.");
                }
        }
}
