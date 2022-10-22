package estruturaCondicional;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = leia.nextInt();
		double valor = 50.00;
		valor = (minutos <100) ? 50.00:  valor+2*(minutos-100);
		System.out.println("Valor a pagar: "+valor);

	}

}
