package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Number:");
		int number =leia.nextInt();
		System.out.println("Valor: ");
		double valor = leia.nextDouble();
		System.out.println("Working hours:");
		double hours = leia.nextDouble();
		double salary =valor*hours;
		System.out.println("Number: "+number);
		System.out.printf("Salary = U$ %.2f\n",salary);

	}

}
