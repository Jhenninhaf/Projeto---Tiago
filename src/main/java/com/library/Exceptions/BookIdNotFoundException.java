package com.library.Exceptions;

import com.library.DTO.BookDTO;

public class BookIdNotFoundException extends RuntimeException {
  public BookIdNotFoundException(BookDTO message) {
    super(message);
  }
}