package com.library.services;

import com.library.DTO.CanetaDTO;
import com.library.domain.Caneta;
import com.library.repositories.CanetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanetaService {

    private static CanetaRepository canetaRepository;

    public CanetaService(CanetaRepository canetaRepository) {
        this.canetaRepository = canetaRepository;
    }

    public Caneta createPen(CanetaDTO canetaDTO) {
        Caneta caneta = Caneta.builder()
                .name(canetaDTO.name())
                .color(canetaDTO.color())
                .valor(canetaDTO.valor())
                .quantity(canetaDTO.quantity())
                .build();
        return canetaRepository.save(caneta);
    }

    public List<Caneta> getAllPens() {
        return canetaRepository.findAll();
    }

    public void deletePen(UUID id) {
        canetaRepository.deleteById(id);
    }

    public static Caneta updateCaneta(UUID id, CanetaDTO canetaDTO) {
        Caneta caneta = canetaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Caneta não encontrada"));

        caneta.setName(canetaDTO.name());
        caneta.setColor(canetaDTO.color());
        caneta.setValor(canetaDTO.valor());
        caneta.setQuantity(canetaDTO.quantity());

        return canetaRepository.save(caneta);
    }


}