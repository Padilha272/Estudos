package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter with rent data: ");
		System.out.println("Car model: ");
		String carModel = sc.nextLine();
		Vehicle vehicle = new Vehicle(carModel); 
		System.out.println("Pickup (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.println("Return (dd/MM/yyyy hh:mm): ");
		
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental cr = new CarRental(start,finish, vehicle);
		
		System.out.println("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService()) ;
			
		rentalService.processInvoce(cr);
		
		
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: "+cr.getInvoice().getBasicPayment());
		System.out.println("imposto: "+cr.getInvoice().getTax());
		System.out.println("Pagamento total: "+cr.getInvoice().getTotalPayment());
		
	}

}
