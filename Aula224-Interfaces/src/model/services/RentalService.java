package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private double pricePerDay;
	private double pricePerHour;
	
	
	private BrazilTaxService brazilTaxService;


	public RentalService(double pricePerDay, double pricePerHour, BrazilTaxService brazilTaxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxService = brazilTaxService;
	}

	public void processInvoce(CarRental carRental) {
		
		double minutes =Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60.0;
		
		double basicPayment;
		if (hours<=12) {
			basicPayment= pricePerHour * Math.ceil(hours) ;
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24);
		}
		double tax= brazilTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment,tax));
	}
	
	
	
	
	

}
