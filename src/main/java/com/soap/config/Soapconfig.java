/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soap.config;

import com.soap.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 *
 * @author DELL LATITUDE 5401
 */
@Configuration
public class Soapconfig {
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl");
        return marshaller;
    }
    @Bean
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller){
      SoapClient soapClient = new SoapClient();
      soapClient.setDefaultUri("http://www.banguat.gob.gt/variables/ws/TipoCambioRango");
       soapClient.setMarshaller(marshaller);
       soapClient.setUnmarshaller(marshaller);
       
       return soapClient;
       
    }
}
