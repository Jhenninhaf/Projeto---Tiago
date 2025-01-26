package com.library.services;

import com.library.DTO.CanetaDTO;
import com.library.domain.CanetaJava;
import com.library.repositories.CanetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanetaService {

    private final CanetaRepository canetaRepository;

    public CanetaService(CanetaRepository canetaRepository) {
        this.canetaRepository = canetaRepository;
    }

    public List<CanetaJava> getAllPens() {
        return canetaRepository.findAll();
    }

    public CanetaJava getPenById(UUID id) {
        return canetaRepository.findById(id).orElseThrow(() -> new RuntimeException("Caneta não encontrada"));
    }

    public CanetaJava createPen(CanetaDTO canetaDTO) {

        CanetaJava caneta = new CanetaJava(
                canetaDTO.name(),
                canetaDTO.color(),
                canetaDTO.valor(),
                canetaDTO.quantity()
        );

        return canetaRepository.save(caneta);
    }




    public void deletePen(UUID id) {
        canetaRepository.deleteById(id);
    }
}
