package com.library.services;

import com.library.Exceptions.CanetaIdNotFoundExeption;
import com.library.domain.CanetaJava;
import com.library.repositories.CanetaRepository;
import com.library.Exceptions.bookIdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanetaService {

    private final CanetaRepository canetaRepository;

    @Autowired
    public CanetaService(CanetaRepository canetaRepository) {
        this.canetaRepository = canetaRepository;
    }

    public List<CanetaJava> getAllCanetas() {
        return canetaRepository.findAll();
    }

    public CanetaJava createCaneta(CanetaJava canetaJava) {
        return canetaRepository.save(canetaJava);
    }

    public void deleteCaneta(UUID id) {
        if (!canetaRepository.existsById(id)) {
            throw new CanetaIdNotFoundExeption("Caneta com ID " + id + " não encontrada.");
        }
        canetaRepository.deleteById(id);
    }

    public CanetaJava updateValor(UUID id, double valor) {
        CanetaJava canetaJava = canetaRepository.findById(id).orElseThrow(() ->
                new CanetaIdNotFoundExeption("Caneta com ID " + id + " não encontrada."));
        canetaJava.setValor(valor);
        return canetaRepository.save(canetaJava);
    }
}
