package entities;

public class IndividualPerson extends Person{

	private double healthExpenditures;

	
	
	public IndividualPerson() {
		super();
	}


	

	public IndividualPerson(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}



	

	public double getHealthExpenditures() {
		return healthExpenditures;
	}




	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}




	@Override
	public double totalTax() {
		double tax=0.0;
		if(anualIncome<20000) {
			tax= anualIncome*0.15;
		} else if(anualIncome>20000) {
			tax = anualIncome*0.25;
		}
		if(healthExpenditures>0) {
			tax -=(healthExpenditures*0.5);
		}
		return tax;
	}
	
	
}
