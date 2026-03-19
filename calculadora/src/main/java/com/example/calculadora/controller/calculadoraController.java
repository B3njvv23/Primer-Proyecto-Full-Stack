package com.example.calculadora.controller;

import com.example.calculadora.service.calculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/calculadora")
public class calculadoraController {

    @Autowired
    private calculadoraService calculadoraService;

    @GetMapping("/sum")
    public double sum(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.sum(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.divide(a, b);
    }
    

}
