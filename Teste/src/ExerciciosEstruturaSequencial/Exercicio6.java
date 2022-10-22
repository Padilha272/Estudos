package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double a = leia.nextDouble();
		double b = leia.nextDouble();
		double c = leia.nextDouble();
		System.out.printf("triangulo = %.3f%n",(a*c)/2);
		System.out.printf("Circulo = %.3f%n",3.14159*(c*c));
		System.out.printf("Trapezio = %.3f%n",((a+b)*c)/2);
		System.out.printf("Quadrado = %.3f%n",4*b);
		System.out.printf("Retângulo = %.3f%n",a*b);

	}

}
