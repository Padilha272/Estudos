package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double pi = 3.14159;
		System.out.println("Digite o valor do raio:");
		double raio = leia.nextDouble();
		double area = pi*Math.pow(raio,2);
		System.out.printf("A = %.4f",area);
	}

}
