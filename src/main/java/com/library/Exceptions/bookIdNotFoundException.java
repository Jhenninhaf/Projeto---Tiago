package com.library.Exceptions;

import com.library.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class bookIdNotFoundException extends RuntimeException {
  public bookIdNotFoundException(String message) {
    super(message);
  }
}

// TODO - Remover import nao usados