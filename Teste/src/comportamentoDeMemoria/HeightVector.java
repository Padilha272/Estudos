package comportamentoDeMemoria;

import java.util.Scanner;

public class HeightVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people ?");
		int n = sc.nextInt();
		double sum = 0;
		double vector[]= new double [n];
		for(int i=0;i< vector.length;i++) {
			System.out.println("Enter the person's height: ");
			vector[i]=sc.nextDouble();
		}
		for(int i=0;i< vector.length;i++) {
			sum+=vector[i];
		}
		System.out.printf("Average height = %.2f",sum/n);

	}

}
