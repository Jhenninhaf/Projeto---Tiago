package com.library.controller;

import com.library.DTO.CanetaDTO;
import com.library.domain.Caneta;
import com.library.services.CanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/canetas")
public class CanetaController {

    @Autowired
    private CanetaService canetaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Caneta createPen(@RequestBody CanetaDTO canetaDTO) {
        return canetaService.createPen(canetaDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Caneta> getAllPens() {
        return canetaService.getAllPens();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePen(@PathVariable UUID id) {
        canetaService.deletePen(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Caneta updateCaneta(@PathVariable UUID id, @RequestBody CanetaDTO CanetaDTO) {
        return CanetaService.updateCaneta(id, CanetaDTO);
    }

}
