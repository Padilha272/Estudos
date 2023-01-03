package entities;

//A palavra abstract faz com que a classe não possa ser instanciada.	
public abstract class Account {
	
	protected Integer number;
	protected String holder;
	protected double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void withdraw(double amount) {
		balance -= (amount+5);
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
	}
	
}
