package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    private final PetRepository repo;

    public PetController(PetRepository repo) {
        this.repo = repo;
    }

    // Test endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, REST API works!";
    }

    // Return pets from DB in JSON
    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return repo.findAll();
    }
}
