package com.github.jalpereira;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author: Jose Augusto de Lima Pereira
 * created: 10/06/2020
 * project: SpringExpert
 **/

@Configuration
public class StartConfiguration {

    @Bean
    public String applicationName() {
        return "Sistema de Vendas.";
    }

}
