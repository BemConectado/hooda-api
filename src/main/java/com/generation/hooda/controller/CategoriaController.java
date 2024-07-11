package com.generation.hooda.controller;

import com.generation.hooda.model.Categoria;
import com.generation.hooda.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/categoria")
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping
    ResponseEntity<List<Categoria>> findAll(){
        return ResponseEntity.ok(categoriaRepository.findAll());
    }
}
