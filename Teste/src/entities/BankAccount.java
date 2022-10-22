package entities;

import java.util.Scanner;

public class BankAccount {

	private int account;
	private String holder;
	private double deposit;
	
	public BankAccount(int account,String holder,double deposit) {
		System.out.print("Enter account number: ");
		this.account=sc.nextInt();
		sc.nextLine();
		this.holder = generateHolder(holder);
		this.deposit=initialDeposit(deposit);
	}

	public int getAccount() {
		return account;
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDeposit() {
		return deposit;
	}

	public void enterDeposit(double deposit) {
		System.out.println("Enter Deposit Value:");
		deposit = sc.nextDouble();
		this.deposit =this.deposit+deposit;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public String generateHolder(String holder) {
		System.out.println("Enter Account holder:");
		return sc.nextLine();
	}
	public double initialDeposit(double deposit) {
		System.out.print("Is there any initial deposit(y/n) ?");
		char resp = sc.next().charAt(0);
		if(resp=='y') {
			System.out.print("Enter initial deposit: ");
			deposit=sc.nextDouble();
			return this.deposit=deposit;
		}else {
			return this.deposit=0;
		}										
	}
	
	
	public void withdraw(double withdrawValue) {
		System.out.println("Enter withdraw value: ");
		withdrawValue=sc.nextDouble();
		this.deposit=(this.deposit-withdrawValue)-5.00;
	}
	
	
	
	
	
	public String toString() {
		return "Account data:\n"+"Account: "+this.account+"| Holder: "+this.holder+"| Balance: R$"+this.deposit;
	}
	
	
}
