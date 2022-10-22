package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Triangleapp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Triangle t1 = new Triangle(null, 0, 0, 0, 0);
		t1.setTriangle(null, 0, 0, 0);
		t1.setArea(t1.getA(), t1.getB(), t1.getC(), 0);
		sc.nextLine();
		Triangle t2 = new Triangle(null, 0, 0, 0, 0);
		t2.setTriangle(null, 0, 0, 0);
		t2.setArea(t2.getA(), t2.getB(), t2.getC(), 0);	 
		if(t1.getArea()>t2.getArea()) {
			System.out.println("Larger area: "+t1.getName());
		}else {
			System.out.println("Larger area: "+t2.getName());
		}
		
		
		
		
		
		
		
		

	}

}
