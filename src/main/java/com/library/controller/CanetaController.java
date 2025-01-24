package com.library.controller;

import com.library.domain.CanetaJava;
import com.library.services.CanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/canetas")
public class CanetaController {

    private final CanetaService canetaService;

    @Autowired
    public CanetaController(CanetaService canetaService) {
        this.canetaService = canetaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CanetaJava createCanetaJava(@RequestBody CanetaJava canetaJava) {
        return canetaService.createCaneta(canetaJava);
    }

    @GetMapping
    public List<CanetaJava> getAllCanetas() {
        return canetaService.getAllCanetas();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCanetaJava(@PathVariable UUID id) {
        canetaService.deleteCaneta(id);
    }

    @PutMapping("/{id}/update-valor")
    public ResponseEntity<CanetaJava> updateValor(@PathVariable UUID id, @RequestBody CanetaJava canetaJava) {
        return ResponseEntity.ok(canetaService.updateValor(id, canetaJava.getValor()));
    }
}
