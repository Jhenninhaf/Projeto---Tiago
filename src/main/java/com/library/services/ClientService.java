package com.library.services;

import com.library.DTO.ClientDTO;
import com.library.Client.Client;
import com.library.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(UUID id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public Client createClient(ClientDTO clientDTO) {
        Client client = new Client(
                clientDTO.name(),
                clientDTO.address(),
                clientDTO.birthDate()
        );
        return clientRepository.save(client);
    }

    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }

    public Client updateClient(UUID id, ClientDTO clientDTO) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        client.setName(clientDTO.name());
        client.setAddress(clientDTO.address());
        client.setBirthDate(clientDTO.birthDate());

        return clientRepository.save(client);
    }
}
