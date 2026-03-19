package com.example.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class calculadoraService {

    public double sum(double a, double b){
        return  a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por 0!!");

        }
        return a / b;
    }
}
