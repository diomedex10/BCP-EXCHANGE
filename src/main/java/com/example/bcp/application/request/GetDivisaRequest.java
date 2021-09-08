package com.example.bcp.application.request;

public class GetDivisaRequest {
	private String originCurrency;
	private double startingAmount;
	private String destinationCurrency ;
	
	public String getOriginCurrency() {
		return originCurrency;
	}
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}
	public double getStartingAmount() {
		return startingAmount;
	}
	public void setStartingAmount(double startingAmount) {
		this.startingAmount = startingAmount;
	}
	public String getDestinationCurrency() {
		return destinationCurrency;
	}
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}
}
