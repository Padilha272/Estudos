package entities;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area(double width,double height) {
		return width*height;
	}
	
	
	public double perimeter(double width,double height) {
		
		return (2*width)+(2*height);
	}
	
	public double diagonal(double width,double height) {
		
		return Math.sqrt((height*height)+(width*width));
	}
	
	public String toString() {
		
		return String.format("Area: %.2f",area(width,height))
				+String.format("\nPerimeter: %.2f",perimeter(width,height))
				+String.format("\nDiagonal: %.2f",diagonal(width,height));
	}
	
	
	
	
	
}
