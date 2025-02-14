package com.library.controller;

import com.library.DTO.ClientDTO;
import com.library.domain.Client;
import com.library.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody ClientDTO clientDTO) {
        return clientService.createClient(clientDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client updateClient(@PathVariable Long id, @RequestBody ClientDTO clientDTO) {
        return clientService.updateClient(id, clientDTO);
    }
}
