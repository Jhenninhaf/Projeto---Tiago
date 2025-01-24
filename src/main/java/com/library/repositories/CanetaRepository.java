package com.library.repositories;

import com.library.domain.CanetaJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CanetaRepository  extends JpaRepository<CanetaJava, UUID>{
}
