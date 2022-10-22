package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee(null, 0, 0);
		System.out.print("Name: ");
		employee.setName(sc.nextLine());
		System.out.print("Salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		System.out.println(employee);
		System.out.println("Percentage to increase: ");
		employee.IncreaseSalaryPercentage(sc.nextDouble());
		System.out.println(employee);
		
		
		
		
		
		

	}

}
