package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		List<Shape>list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.println("Rectangle or circle (r/c)?");
			char c = sc.next().charAt(0);
			while(c!='r'&& c!='c') {
				System.out.println("Invalid! Try again.");
				System.out.println("Rectangle or circle (r/c)?");
				 c = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.println("Color(BLACK/BLUE/RED: ");
			String color = sc.nextLine();
			if(c=='r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();			
				list.add( new Rectangle(Color.valueOf(color),width,height));
				
			}
			
			if(c=='c') {
				System.out.print("Radius:");
				double radius = sc.nextDouble();
				 list.add(new Circle(Color.valueOf(color),radius));
				
			}
		}
		
		System.out.println("Shape of areas:");
		for(Shape s: list){
			System.out.println(String.format("%.2f", s.area()));
		}
		

	}

}
