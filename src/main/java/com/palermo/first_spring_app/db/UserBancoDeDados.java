package com.palermo.first_spring_app.db;

import java.util.ArrayList;
import java.util.List;
import com.palermo.first_spring_app.domain.User;

public class UserBancoDeDados {

    private List<User> usuarios;

    public UserBancoDeDados() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(User user) {
        usuarios.add(user);
    }

    public List<User> listarUsuarios() {
        return usuarios;
    }

    public User obterUsuario(int id) {
        if (id < 0 || id >= usuarios.size()) {
            return null;
        }
        return usuarios.get(id);
    }

    public User atualizarUsuario(int id, User user) {
        if (id < 0 || id >= usuarios.size()) {
            return null;
        }
        usuarios.set(id, user);
        return usuarios.get(id);
    }

    public User removerUsuario(int id) {
        if (id < 0 || id >= usuarios.size()) {
            return null;
        }
        return usuarios.remove(id);
    }   
}
