package com.dev.springboot.controller;

import com.dev.springboot.model.Votante;
import com.dev.springboot.service.VotanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private VotanteService votanteService;

    @GetMapping
    public String helloWord(){
        return "Hello World";
    }


    @GetMapping("/{cedula}")
    public Votante helloWord(@PathVariable String cedula){
        return votanteService.buscarVotante(cedula);
    }
}
