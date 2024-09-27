/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soap.client;

import com.soap.wsdl.TipoCambioRango;
import com.soap.wsdl.TipoCambioRangoResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 *
 * @author DELL LATITUDE 5401
 */
@Service
public class SoapClient extends WebServiceGatewaySupport {
    
    public TipoCambioRangoResponse getTipoCambioRangoResponse( String fechainit, String fechafin){
       TipoCambioRango  tipoCambioRangoRequest = new  TipoCambioRango ();
       tipoCambioRangoRequest.setFechainit(fechainit);
       tipoCambioRangoRequest.setFechafin(fechafin);
       
       SoapActionCallback soapActionCallback = new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/TipoCambioRango");
       
        TipoCambioRangoResponse tipoCambioRangoResponse =  (TipoCambioRangoResponse) getWebServiceTemplate().marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", tipoCambioRangoRequest, soapActionCallback);
       
       return tipoCambioRangoResponse;
    }
   
}
