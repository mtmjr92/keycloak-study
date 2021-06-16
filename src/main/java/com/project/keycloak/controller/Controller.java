package com.project.keycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/keycloak")
public class Controller {

    @GetMapping
    public static ResponseEntity<List<String>> endpoint() {
        return ResponseEntity.ok(Arrays.asList("Maria", "Joao", "Ronaldo"));
    }

}
