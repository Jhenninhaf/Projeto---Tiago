package com.library.controller;

import com.library.DTO.BookDTO;
import com.library.DTO.CanetaDTO;
import com.library.domain.Book;
import com.library.domain.CanetaJava;
import com.library.services.CanetaService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/canetas")
public class CanetaController {

    private final CanetaService canetaService;
    public CanetaController(CanetaService canetaService) {
        this.canetaService = canetaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CanetaJava createPen( @RequestBody CanetaDTO canetaDTO) {
        return canetaService.createPen(canetaDTO);
    }


    @GetMapping
    public List<CanetaJava> getAllPens() {
        return canetaService.getAllPens();
    }

    @GetMapping("/{id}")
    public CanetaJava getPenById(@PathVariable UUID id) {
        return canetaService.getPenById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePen(@PathVariable UUID id) {
        canetaService.deletePen(id);
    }
}

// TODO - Remover import nao usados