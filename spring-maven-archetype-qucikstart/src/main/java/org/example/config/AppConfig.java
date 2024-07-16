package org.example.config;

import org.example.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;

@Configuration
public class AppConfig {

    @Bean(name="desktop")
    public Desktop desktop(){
        return new Desktop("Desktop",16);
    }

    @Bean(name="laptop")
    @Primary
    public Laptop laptop(){
        return new Laptop("Laptop",32);
    }

    @Bean(name="employee")

    public Employee employee(@Value("25") Integer age, @Qualifier("desktop") Computer computer){
        return new Employee(age,computer);
    }

    @Scope(scopeName = "prototype")
    @Bean(name="prototypeEmployee")
    public PrototypeEmployee prototypeEmployee(){
        return new PrototypeEmployee();
    }

}
