package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor x:");
		int x = leia.nextInt();
		System.out.println("Digite o valor y:");
		int y = leia.nextInt();
		
		int soma = x+y;
		System.out.println("SOMA = "+soma);

	}

}
