package com.example.bcp.application.response;

public class GetDivisaResponse {
	private String originCurrency;
	private String destinationCurrency ; 
	
	private double startingAmount;
	private double finalyAmount;
	private double exchangeRate;
	
	public String getOriginCurrency() {
		return originCurrency;
	}
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}
	public String getDestinationCurrency() {
		return destinationCurrency;
	}
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}
	public double getStartingAmount() {
		return startingAmount;
	}
	public void setStartingAmount(double startingAmount) {
		this.startingAmount = startingAmount;
	}
	public double getFinalyAmount() {
		return finalyAmount;
	}
	public void setFinalyAmount(double finalyAmount) {
		this.finalyAmount = finalyAmount;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
}
