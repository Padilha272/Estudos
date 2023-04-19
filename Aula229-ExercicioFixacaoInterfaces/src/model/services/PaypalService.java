package model.services;

public class PaypalService implements OnlinePaymentService{
	
	public static final double MONTHLY_TAX = 0.01;
	public static final double PAYMENT_TAX = 0.02;
	
	
	@Override
	public double paymentFee(double amount) {
		
		return amount*PAYMENT_TAX;
	}

	@Override
	public double interest(double amount, Integer months) {
		
		return amount*months*MONTHLY_TAX;
	}

}
