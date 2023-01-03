package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001,"Alex",500,0.01));
		list.add(new BusinessAccount(1002,"Maria",1000,400));
		list.add(new SavingsAccount(1004,"Bob",300,0.01));
		list.add(new BusinessAccount(1005,"Ana",500,500));
		
		
		double sum =0.0;
		for(Account cc : list ) {
			sum += cc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n",sum);
		
		for(Account cc : list ) {
			cc.deposit(10.0);
		}
		
		
		for(Account cc : list ) {
			System.out.printf("Updated balance for account %d: %.2f%n",cc.getNumber(),cc.getBalance());
		}
		
		
	}

}
