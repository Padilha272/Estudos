package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("A:");
		int a = leia.nextInt();
		System.out.println("B:");
		int b = leia.nextInt();
		System.out.println("C:");
		int c = leia.nextInt();
		System.out.println("D:");
		int d = leia.nextInt();
		int diferenca = (a*b)-(c*d);
		System.out.println("DIFERENÇA = "+diferenca );
	}

}
