package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to type ?");
		int n = sc.nextInt();
		double vector[] = new double [n];
		double higher=0;
		
		for (int i = 0; i<vector.length;i++) {
			System.out.print("Enter a number: ");
			vector[i]=sc.nextDouble();			
		}
		for (int i = 0; i<vector.length;i++) {
			if(higher<vector[i]) {
				higher=vector[i];
			}
		}
		System.out.println("Higher value: "+higher);
		for (int i = 0; i<vector.length;i++) {
			if(higher==vector[i]) {
				System.out.println("Position of the higher value: "+i);
			}
		}

	}

}
