package com.library.repositories;

import com.library.domain.CanetaJava;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface CanetaRepository extends JpaRepository<CanetaJava, UUID> {
    List<CanetaJava> findByQuantityGreaterThan(int quantity);
}
