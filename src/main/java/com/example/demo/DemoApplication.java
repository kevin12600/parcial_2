
package com.example.demo;

import com.soap.client.SoapClient;
import com.soap.wsdl.TipoCambioRangoResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RestController
public class DemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);  // Usando SLF4J 

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(SoapClient soapClient) {
        return args -> {
            // Las fechas deben pasarse como cadenas
            String fechainit = "18/05/2024";
            String fechafin = "19/05/2024";
            
            // Llamar al método del cliente SOAP
            TipoCambioRangoResponse tipoCambioRangoResponse = soapClient.getTipoCambioRangoResponse(fechainit, fechafin);

            // Registro de información con las fechas y el resultado
            LOGGER.info("Los cambios de las fechas {} y {} son: {}", fechainit, fechafin, tipoCambioRangoResponse.getTipoCambioRangoResult());
        };
    }
}