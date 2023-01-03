package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.IndividualPerson;
import entities.JuridicalPerson;
import entities.Person;

public class Program {

	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c) ? ");
			char c = sc.next().charAt(0);
			while(c!='i'&&c!='c') {
				System.out.print("Error! Try again");
				System.out.print("Individual or company (i/c) ? ");
				 c = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double income =sc.nextDouble();
			
			if(c=='i') {
				System.out.print("Health incomes: ");
				double health = sc.nextDouble();
				list.add(new IndividualPerson(name,income,health));
			}
			
			if(c=='c') {
				System.out.print("Number of employeers: ");
				int employeers = sc.nextInt();
				list.add(new JuridicalPerson(name,income,employeers));
			}
			
			
					
		}
		
		System.out.println("TAXES PAID: ");
		for( Person p : list) {
			System.out.printf(p.getName()+": $ %.2f%n",p.totalTax());
		}
		
		double total=0.0;
		for( Person p : list) {
			total += p.totalTax();
		}
		System.out.printf("TOTAL TAXES: $ %.2f",total);

	}
	
}
