package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalEx8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario = leia.nextDouble();
		double imposto = 0.00;
		if (salario <2000) {
			System.out.println("Isento");
		} else if (salario >2000 && salario<=3000) {
			imposto = 0.08*(salario-2000);
		} else if(salario >3000 && salario<=4500) {
			imposto = 0.08*1000 + 0.18*(salario-3000);
		} else {
			imposto = 0.08 * 1000 + 0.18*1500 + 0.28*(salario-4500);
		}
		System.out.printf("Imposto: R$ %.2f",imposto);
	}

}
