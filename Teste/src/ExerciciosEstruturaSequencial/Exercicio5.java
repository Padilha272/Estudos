package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Valor da peça 1:");
		double valor1 = leia.nextDouble();
		System.out.println("Quantidade de peça 1");
		int quant1 = leia.nextInt();
		System.out.println("Valor da peça 2:");
		double valor2 = leia.nextDouble();
		System.out.println("Quantidade de peça 2");
		int quant2 = leia.nextInt();
		
		double total = (valor1*quant1)+(valor2*quant2);
		System.out.printf("VALOR A PAGAR: R$ %.2f ",total);
		

	}

}
