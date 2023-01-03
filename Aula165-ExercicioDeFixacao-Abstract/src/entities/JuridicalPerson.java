package entities;

public class JuridicalPerson extends Person{

	private Integer employees;
	
			
	
	public JuridicalPerson() {
		super();
	}

	

	public JuridicalPerson(String name, double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}



	

	public Integer getEmployees() {
		return employees;
	}



	public void setEmployees(Integer employees) {
		this.employees = employees;
	}



	@Override
	public double totalTax() {
		double tax = 0.0;
		
		if(employees<10) {
			tax = anualIncome*0.16;
		}
		else {
			tax = anualIncome*0.14;
		}
		return tax;
	}

}
