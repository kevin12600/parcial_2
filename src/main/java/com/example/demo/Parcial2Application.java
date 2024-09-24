package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Parcial2Application {
    
    @GetMapping("/prueba")
    public String hell(){
        return "hola hola!!";
        
    }

	public static void main(String[] args) {
		SpringApplication.run(Parcial2Application.class, args);
	}

}
