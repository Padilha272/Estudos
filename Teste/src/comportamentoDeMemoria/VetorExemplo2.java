package comportamentoDeMemoria;

import java.util.Scanner;

import entities.Produto;

public class VetorExemplo2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("How many products ?");
			int n = sc.nextInt();
			
			double sum = 0;
			Produto vector[]= new Produto [n];
			for(int i=0;i< vector.length;i++) {
				sc.nextLine();
				System.out.println("Enter the product's name: ");
				vector[i]= new Produto ("",0);
				vector[i].setNome(sc.nextLine());
				System.out.println("Enter the product's price: ");
				vector[i].setPreco(sc.nextDouble());
			}
			for(int i=0;i< vector.length;i++) {
				sum+=vector[i].getPreco();
			}
			System.out.printf("Average price = %.2f",sum/n);

	}

}
