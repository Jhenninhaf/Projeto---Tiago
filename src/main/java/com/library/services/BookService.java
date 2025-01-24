package com.library.services;

import com.library.Exceptions.CanetaIdNotFoundExeption;
import com.library.Exceptions.bookIdNotFoundException;
import com.library.domain.Book;
import com.library.repositories.BookRepository;
import org.springframework.stereotype.Service;

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

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(UUID id) {
        if (!bookRepository.existsById(id)) {
            throw new bookIdNotFoundException("Livro com ID " + id + " não encontrado.");
        }
        bookRepository.deleteById(id);
    }

    public Book updateValor(UUID id, double valor) {
        Book book = bookRepository.findById(id).orElseThrow(() ->
                new bookIdNotFoundException("Livro com ID " + id + " não encontrado."));
        book.setValor(valor);
        return bookRepository.save(book);
    }
}
