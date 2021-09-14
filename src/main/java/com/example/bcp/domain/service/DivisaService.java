package com.example.bcp.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bcp.application.request.GetDivisaRequest;
import com.example.bcp.application.response.GetDivisaResponse;
import com.example.bcp.domain.entity.Divisa;
import com.example.bcp.infrastrucutre.repository.DivisaRepository;

@Service
public class DivisaService {

	@Autowired
	private DivisaRepository divisaRepository;
	
	public Divisa getDivisaByID(int id) {
		return divisaRepository.getDivisaByID(id);
	}
	
	public GetDivisaResponse getDivisa(GetDivisaRequest divisaRequest) {
		
		String currencyDefault = "USD";
		Divisa divisa, divisaTemp;
		double amontChange = 0;
		
		GetDivisaResponse divisaResponse = new GetDivisaResponse();
		
		divisaResponse.setStartingAmount(divisaRequest.getStartingAmount());
		divisaResponse.setOriginCurrency(divisaRequest.getOriginCurrency());
		divisaResponse.setDestinationCurrency(divisaRequest.getDestinationCurrency());
		
		if(divisaRequest.getDestinationCurrency().equals(currencyDefault)) {
			divisa =  divisaRepository.getDivisaByName(divisaRequest.getOriginCurrency());
			amontChange = divisa.getValue() * (divisaRequest.getStartingAmount()) ;
			divisaResponse.setFinalyAmount(amontChange);
			divisaResponse.setExchangeRate(divisa.getValue());
		} else {
			float exchangeRate = 0;
			divisa =  divisaRepository.getDivisaByName(divisaRequest.getOriginCurrency());
			amontChange = divisa.getValue() * (divisaRequest.getStartingAmount()) ;
			exchangeRate = divisa.getValue();
			
			divisaTemp =  divisaRepository.getDivisaByName(divisaRequest.getDestinationCurrency());
			amontChange =  amontChange/divisaTemp.getValue();
			exchangeRate = exchangeRate/divisaTemp.getValue();
			
			divisaResponse.setFinalyAmount(amontChange);
			divisaResponse.setExchangeRate(exchangeRate);
		}
		
		return divisaResponse;
	}
} 
