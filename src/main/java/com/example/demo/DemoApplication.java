
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class DemoApplication {
    private static final Logger logger = LogManager.getLogger(DemoApplication.class);
    
      @GetMapping("/hello")
    
    public String  hello(){
            return "Hola Mundo";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
                // Prueba de logging
        logger.info("Aplicación iniciada correctamente con Log4j2");
        logger.error("Este es un mensaje de error de prueba");
	}

}