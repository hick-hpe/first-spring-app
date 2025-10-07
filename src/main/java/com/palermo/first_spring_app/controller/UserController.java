package com.palermo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palermo.first_spring_app.domain.User;
import com.palermo.first_spring_app.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listarUsuarios() {
        return userService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public User obterUsuario(@PathVariable int id) {
        return userService.obterUsuario(id);
    }

    @PostMapping
    public void adicionarUsuario(@RequestBody User user) {
        userService.adicionarUsuario(user);
    }

    @PutMapping("/{id}")
    public User atualizarUsuario(
        @PathVariable("id") int id,
        @RequestBody User user
    ) {
        return userService.atualizarUsuario(id, user);
    }

    @DeleteMapping("/{id}")
    public User removerUsuario(@PathVariable int id) {
        return userService.removerUsuario(id);
    }
}


