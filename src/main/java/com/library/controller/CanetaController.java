package com.library.controller;

import com.library.DTO.CanetaDTO;
import com.library.domain.Caneta;
import com.library.services.CanetaService;
import org.springframework.http.HttpStatus;
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
    public Caneta createPen(@RequestBody CanetaDTO canetaDTO) {
        return canetaService.createPen(canetaDTO);
    }


    @GetMapping
    public List<Caneta> getAllPens() {
        return canetaService.getAllPens();
    }

    @GetMapping("/{id}")
    public Caneta getPenById(@PathVariable UUID id) {
        return canetaService.getPenById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePen(@PathVariable UUID id) {
        canetaService.deletePen(id);
    }

    @PutMapping("/{id}")
    public Caneta updateCaneta(@PathVariable UUID id, @RequestBody CanetaDTO CanetaDTO) {
        return CanetaService.updateCaneta(id, CanetaDTO);
    }


}

