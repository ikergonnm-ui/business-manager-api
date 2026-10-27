package com.businessmanager.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/clients/{id}")
    public ResponseEntity<Client> getClient(@PathVariable int id) {

        if (id == 1) {
            Client client = new Client("Carlos", "Carlos@exemple.com");
            return ResponseEntity.ok(client);

        } else if (id == 2) {
            Client client = new Client("Ana", "Ana@exemple.com");
            return ResponseEntity.ok(client);

        } else {
            return ResponseEntity.notFound().build();
        }
    }
}