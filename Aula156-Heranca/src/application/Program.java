package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
		
		// UPCASTING - Converter um objeto da subclasse para a superclasse
		
		Account acc1 = bacc;
		//Uma conta empresarial é uma conta
		Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004,"Ana",20,0.01);
		
		// DOWNCASTING - Converter um objeto da superclasse para a subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			System.out.println(acc5.getBalance());
		}
		
		
	}

}
