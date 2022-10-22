package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		double value=0;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there any initial deposit(y/n) ?");
		char resp = sc.next().charAt(0);
		if(resp=='y') {
			System.out.print("Enter initial deposit: ");
			double amount = sc.nextDouble();
			 account = new Account(number,holder,amount);
		}else {
			 account = new Account(number,holder);
		}
		System.out.println(account);
		System.out.println("Enter deposit value:");
		value = sc.nextDouble();
		account.deposit(value);
		System.out.println(account);
		System.out.println("Enter withdraw value:");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println(account);
		
	}

}
