package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalEx7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a coordenada em X:");
		double x = leia.nextDouble();
		System.out.println("Digite a coordenada em Y:");
		double y = leia.nextDouble();
		if(x>0 && y>0) {
			System.out.println("Q1");
		} else if (x <0 && y>0) {
			System.out.println("Q2");
		} else if (x <0 && y<0) {
			System.out.println("Q3");
		} else if (x >0 && y<0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}

	}

}
