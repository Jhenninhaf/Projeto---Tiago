package com.library.services;

import com.library.DTO.BookDTO;
import com.library.Exceptions.BookIdNotFoundException;
import com.library.domain.Book;
import com.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(BookDTO bookDTO) {
        Book book = Book.builder()
                .name(bookDTO.name())
                .author(bookDTO.author())
                .valor(bookDTO.valor())
                .quantity(bookDTO.quantity())
                .build();
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(UUID id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(UUID id, BookDTO bookDTO) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookIdNotFoundException(bookDTO));
         book.setAuthor(bookDTO.author());
         book.setName(bookDTO.name());
         book.setValor(bookDTO.valor());
         book.setQuantity(bookDTO.quantity());
        return book;
    }

    // fazer um put - update

}
