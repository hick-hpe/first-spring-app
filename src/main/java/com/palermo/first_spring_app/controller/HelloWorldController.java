package com.palermo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.palermo.first_spring_app.domain.User;
import com.palermo.first_spring_app.service.HelloWorldService;

@RestController // indica que a classe é um controller Rest
@RequestMapping("/hello-world") // mapeia uma URL para a classe ou método
public class HelloWorldController {

    @Autowired // faz a injeção de dependência (new HelloWorldService())
    private HelloWorldService helloWorldService;

    @GetMapping
    // @GetMapping("/get")
    public String helloWorld() {
        return helloWorldService.helloWorld("Hick");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(
            @PathVariable("id") String id,
            @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
            @RequestBody User body) {
        // return "Hello World " + body.getName() + ", ID: " + id;
        return "Hello World " + body.getNome() + ", filter:" + filter;
    }
}
