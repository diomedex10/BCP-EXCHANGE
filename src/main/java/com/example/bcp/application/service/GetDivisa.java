package com.example.bcp.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bcp.application.request.GetDivisaRequest;
import com.example.bcp.application.response.GetDivisaResponse;
import com.example.bcp.domain.service.DivisaService;

@Service
public class GetDivisa {
	
	@Autowired
	private DivisaService divisaService;
	
	public GetDivisaResponse getDivisa(GetDivisaRequest divisaRequest) {
		
		return divisaService.getDivisa(divisaRequest);
		
	}
}
