package com.palermo.first_spring_app.service;

import org.springframework.stereotype.Service;
import com.palermo.first_spring_app.db.UserBancoDeDados;
import com.palermo.first_spring_app.domain.User;
import java.util.List;

@Service
public class UserService {

    private final UserBancoDeDados userBanco;

    public UserService() {
        this.userBanco = new UserBancoDeDados();
        // adiciona alguns usuários iniciais só pra testar
        userBanco.adicionarUsuario(new User("Henrique", "henrique@gmail.com"));
        userBanco.adicionarUsuario(new User("Palermo", "palermo@gmail.com"));
    }

    public List<User> listarUsuarios() {
        return userBanco.listarUsuarios();
    }

    public void adicionarUsuario(User user) {
        userBanco.adicionarUsuario(user);
    }

    public User obterUsuario(int id) {
        return userBanco.obterUsuario(id);
    }
    
    public User atualizarUsuario(int id, User user) {
        return userBanco.atualizarUsuario(id, user);
    }

    public User removerUsuario(int id) {
        return userBanco.removerUsuario(id);
    }    
}

