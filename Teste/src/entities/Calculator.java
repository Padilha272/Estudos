package entities;

public class Calculator {
	public static final double PI = 3.14159;
	private double radius;
	
	
	
	public Calculator(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public static double circunference(double radius) {
		return 2.0*PI*radius;
	}

	public static double volume(double radius) {
		return 4*PI*Math.pow(radius, 3)/3;
	}
	
	public static double dollar(double cotacao, double quantidade) {
		return cotacao*quantidade+(cotacao*quantidade*0.06);
	}
}
