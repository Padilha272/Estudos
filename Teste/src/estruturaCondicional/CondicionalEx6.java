package estruturaCondicional;

import java.util.Scanner;

public class CondicionalEx6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor:");
		double valor = leia.nextDouble();
		if (valor >=0 && valor <=25 ) {
			System.out.println("Intervalo [0,25]");
		} else if (valor >25 && valor <=50) {
			System.out.println("Intervalo [25,50]");
		} else if (valor >50 && valor <=75) {
			System.out.println("Intervalo [50,75]");
		} else if (valor >57 & valor<=100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}

	}

}
