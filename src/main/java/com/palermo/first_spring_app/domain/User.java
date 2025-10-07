package com.palermo.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // gera automaticamente os métodos getters
@Setter // gera automaticamente os métodos setters
@AllArgsConstructor // gera automaticamente o construtor
public class User {
    private String nome;
    private String email;
}
