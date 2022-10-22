package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {
	
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dollar price:");
		double price = sc.nextDouble();
		System.out.println("How many dollars?");
		double quantity = sc.nextDouble();
		System.out.printf("Amout to be paid in reais= %.2f",Calculator.dollar(price, quantity));
		/*System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		
		double v = volume(radius);
		
		
		System.out.printf("Circunference: %.2f\n",Calculator.circunference(radius));
		System.out.printf("Volume: %.2f\n",Calculator.volume(radius));
		System.out.printf("PI: %.2f",Calculator.PI);*/
	}
	
	public static double circunference(double radius) {
		return 2.0*PI*radius;
	}

	public static double volume(double radius) {
		return 4*PI*Math.pow(radius, 3)/3;
	}
}
