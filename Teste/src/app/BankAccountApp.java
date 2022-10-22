package app;

import java.util.Scanner;

import entities.BankAccount;

public class BankAccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount(0, null, 0);
		System.out.println(account);
		double value=0;
		account.enterDeposit(value);
		System.out.println(account);
		double withdraw=0;
		account.withdraw(withdraw);
		System.out.println(account);
		
	}

}
