package estruturaCondicional;

import java.util.Scanner;

public class CondicionalEx1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valor = leia.nextInt();
		if (valor<0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}

	}

}
