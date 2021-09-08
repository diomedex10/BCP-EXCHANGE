package com.example.bcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bcp.application.request.GetDivisaRequest;
import com.example.bcp.application.response.GetDivisaResponse;
import com.example.bcp.application.service.GetDivisa;

@RestController
public class DivisaController {
	
	@Autowired 
	private GetDivisa divisaApp;
	
	@PostMapping("/exchange")
	public GetDivisaResponse getExchange(@RequestBody GetDivisaRequest request) {
		//divisaApp = new GetDivisa();
		return divisaApp.getDivisa(request);
	}
}
