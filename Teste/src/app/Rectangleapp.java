package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Rectangleapp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = new Rectangle(0, 0);
		System.out.print("Enter width: ");
		retangulo.setWidth(sc.nextDouble());
		System.out.print("Enter height: ");
		retangulo.setHeight(sc.nextDouble());
		System.out.println(retangulo);

	}

}
