package com.example.naruto.obito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class obitoUchiha {

    @GetMapping("/Obito")
    public String holaMundo(){
        return"Obito fue el mejor personaje de la 4ta guerra ninja";
    }
    
}
