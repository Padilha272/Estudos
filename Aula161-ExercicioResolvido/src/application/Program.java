package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		double n = sc.nextDouble();
		List<Employee> funcionario = new ArrayList<>();
		sc.nextLine();
		for(int i =0;i<n;i++) {
			System.out.println("Employee "+"#"+(i+1)+" data:");
			System.out.print("Outsorced ?");
			char c = sc.next().charAt(0);
			sc.nextLine();			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hours: ");
			double valuePerHours = sc.nextDouble();
				if(c=='y') { 
					System.out.println("Additional: ");
					double additional = sc.nextDouble();
					Employee x = new OutsorcedEmployee(name,hours,valuePerHours,additional);
					funcionario.add(x);	
				
				}else {				
					Employee  x = new Employee(name,hours,valuePerHours);
					funcionario.add(x);
				}
				
		}
			System.out.println("PAYMENTS: ");
			for(Employee l : funcionario) {
			System.out.println(l.toString());
			}		
								
	}
	}

