package estruturasRepetitivas;

import java.util.Scanner;

public class DoWhileExemplo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char resp;
		do {
			double temperatura = leia.nextDouble();
			double conversao = ((9*temperatura)/5) +32;
			System.out.printf("%.2f%n",conversao);
			System.out.println("Quer continuar?");
			resp=leia.next().charAt(0);
		}while(resp!='n');

	}

}
