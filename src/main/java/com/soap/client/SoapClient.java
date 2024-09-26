/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soap.client;

import com.soap.wsdl.TipoCambioRango;
import com.soap.wsdl.TipoCambioRangoResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 *
 * @author DELL LATITUDE 5401
 */
public class SoapClient extends WebServiceGatewaySupport {
    
    public TipoCambioRangoResponse getTipoCambioRangoResponse( String fechainit, String fechafin){
       TipoCambioRango = tipocambiorango = new  TipoCambioRango ();

    }
    
}
