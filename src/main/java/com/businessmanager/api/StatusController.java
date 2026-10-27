package com.businessmanager.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/clients/1")
    public Client getClient() {
        return new Client("Carlos", "Carlos@exemple.com");
        
    }
}

