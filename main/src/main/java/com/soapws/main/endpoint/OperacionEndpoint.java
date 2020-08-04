package com.soapws.main.endpoint;

import org.example.operacion.ObtenerOperacionRequest;
import org.example.operacion.ObtenerOperacionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OperacionEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.example.org/Operacion";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerOperacionRequest")
	@ResponsePayload
	public ObtenerOperacionResponse getOperacion(@RequestPayload ObtenerOperacionRequest request) {
		ObtenerOperacionResponse response = new ObtenerOperacionResponse();
		response.setId(1);
		response.setNumOpe("8000");
		response.setDescripcion("Nos enviaste el valor: "+ request.getNombre());

		return response;
	}

}
