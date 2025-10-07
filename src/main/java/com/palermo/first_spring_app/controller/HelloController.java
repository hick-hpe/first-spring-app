package com.palermo.first_spring_app.controller;

import com.palermo.first_spring_app.service.MinhaBiblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MinhaBiblioteca biblioteca;

    @GetMapping("/saudacao")
    public String saudacao() {
        return biblioteca.saudacao("Henrique");
    }
}
