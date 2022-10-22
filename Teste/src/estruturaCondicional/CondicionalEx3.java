package estruturaCondicional;

import java.util.Scanner;

public class CondicionalEx3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valor1 = leia.nextInt();
		System.out.print("Digite outro valor: ");
		int valor2 = leia.nextInt();
		if ((valor1%valor2==0)||(valor2%valor1==0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
