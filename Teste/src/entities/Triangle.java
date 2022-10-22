package entities;

import java.util.Scanner;

public class Triangle {
	
	private String name;
	private double a;
	private double b;
	private double c;
	private double area;
	
	public Triangle (String name,double a,double b,double c,double area) {
		this.name= name;
		this.a=a;
		this.b=b;
		this.c=c;
		this.area=area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double a,double b,double c,double area) {
		double p = (a+b+c)/2;
		area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		this.area = area;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void setTriangle(String name,double a,double b,double c) {
		System.out.print("Set Triangle name: ");
		name=sc.nextLine();
		setName(name);
		System.out.print("Set measure A: ");
		a=sc.nextDouble();
		setA(a);
		System.out.print("Set measure B: ");
		b=sc.nextDouble();
		setB(b);
		System.out.print("Set measure C: ");
		c=sc.nextDouble();
		setC(c);
		sc.nextLine();
		
	}
	
	
	
	
	
	
}
