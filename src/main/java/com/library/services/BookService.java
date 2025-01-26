package com.library.services;

import com.library.DTO.BookDTO;
import com.library.domain.Book;
import com.library.repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(UUID id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book createBook(BookDTO bookDTO) {
        Book book = new Book(
                bookDTO.name(),
                bookDTO.author(),
                bookDTO.valor(),
                bookDTO.quantity()
        );

        return bookRepository.save(book);
    }


    public void deleteBook(UUID id) {
        bookRepository.deleteById(id);
    }

}
