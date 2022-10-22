package estruturasRepetitivas;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double soma = 0;
		System.out.println("Digite um número inteiro");
		int numero = leia.nextInt();
		soma += numero;
		// While is used when we don't know the exactly number of repetitions 
		while(numero!=0) {
			soma += numero;	
			System.out.println("Digite um número inteiro");
			numero = leia.nextInt();
			
		}
		System.out.println("Soma = "+soma);
	}

}
