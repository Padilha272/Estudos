package estruturaCondicional;

import java.util.Scanner;

public class CondicionalEx5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println(" Codigo   Especificação     Preço");
		System.out.println("------------------------------------");
		System.out.println("    1     Cachorro Quente   R$ 4.00");
		System.out.println("    2     X-Salada          R$ 4.50");
		System.out.println("    3     X-Bacon           R$ 5.00");
		System.out.println("    4     Torrada simples   R$ 2.00");
		System.out.println("    5     Refrigerante      R$ 1.50");
		System.out.println("------------------------------------");
		System.out.print("Digite o código do produto: ");
		double codigo = leia.nextDouble();
		double valor = 0.00;
		double preco = 0.00;
		if ((codigo < 1) || (codigo >5)){
			System.out.println("Código inválido!");
		} else if (codigo ==1) {
			valor = 4.00;
		} else if (codigo ==2) {
			valor = 4.50;
		} else if (codigo ==3) {
			valor = 5.00;
		} else if (codigo ==4) {
			valor = 2.00;
		} else if (codigo ==5) {
			valor = 1.50;
		}
		if (codigo>=1 && codigo <=5) {
			System.out.println("Digite a quantidade que deseja comprar:");
			int quantidade = leia.nextInt();
			preco = valor * quantidade;
			System.out.printf("Total: R$ %.2f",preco);
		}
		
		
	}

}
