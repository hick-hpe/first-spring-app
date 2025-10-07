package com.palermo.first_spring_app.configuration;

import com.palermo.first_spring_app.service.MinhaBiblioteca;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MinhaBiblioteca minhaBiblioteca() {
        return new MinhaBiblioteca(); // Spring vai gerenciar este objeto
    }
}
