package com.example.voiture.services;

import com.example.voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    // Doit correspondre à ClientController (@GetMapping("/client/{id}"))
    @GetMapping(path = "/client/{id}")
    Client clientById(@PathVariable("id") Long id);
}
