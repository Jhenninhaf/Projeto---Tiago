package com.library.Exceptions;

import com.library.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.exceptions;

public class bookIdNotFoundException extends RuntimeException {
  public bookIdNotFoundException(String message) {
    super(message);
  }
}
