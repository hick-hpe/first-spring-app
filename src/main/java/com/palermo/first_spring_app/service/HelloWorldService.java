package com.palermo.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    // logica da aplicação
    
    public String helloWorld(String name) {
        return String.format("<h1>Hello World %s</h1>", name);
    }
}
