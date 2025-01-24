package com.library.Exceptions;

import com.library.domain.CanetaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.exceptions;

public class CanetaIdNotFoundExeption extends RuntimeException {
    public CanetaIdNotFoundExeption(String message) {
        super(message);
    }
}
