package com.library.repositories;

import com.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
    List<Book> findByQuantityGreaterThan(int quantity);
}
