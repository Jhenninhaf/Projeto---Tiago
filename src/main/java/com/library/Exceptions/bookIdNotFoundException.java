package com.library.Exceptions;

public class bookIdNotFoundException extends RuntimeException {
  public bookIdNotFoundException(String message) {
    super(message);
  }
}
