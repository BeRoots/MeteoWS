package com.sebastiendeschamps.MeteoWS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.ParameterStyle;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;

@WebService(serviceName="DailyMeteoService")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.BARE)
public class DailyMeteo 
{
	@WebMethod(operationName="endpointName")
	@WebResult(name="epName")
    public String endpointName()
    {
        return "DailyMeteo";
    }
}
