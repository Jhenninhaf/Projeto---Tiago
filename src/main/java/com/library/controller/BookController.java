package com.library.controller;

import com.library.DTO.BookDTO;
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

    @Autowired
    private BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody BookDTO bookDTO) {
        return bookService.createBook(bookDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable UUID id) {
        bookService.deleteBook(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(@PathVariable UUID id, @RequestBody BookDTO bookDTO) {
        return bookService.updateBook(id, bookDTO);
    }


}

