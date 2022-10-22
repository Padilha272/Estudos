package estruturaCondicional;

import java.util.Scanner;

public class CondicionalEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valor = leia.nextInt();
		if (valor%2==0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
