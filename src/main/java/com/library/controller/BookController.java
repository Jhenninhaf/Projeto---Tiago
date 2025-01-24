package com.library.controller;

import com.library.domain.Book;
import com.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }


    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable UUID id) {
        bookService.deleteBook(id);
    }

    @PutMapping("/{id}/update-valor")
    public ResponseEntity<Book> updateValor(@PathVariable UUID id, @RequestBody Book book) {
        return ResponseEntity.ok(bookService.updateValor(id, book.getValor()));
    }

}
