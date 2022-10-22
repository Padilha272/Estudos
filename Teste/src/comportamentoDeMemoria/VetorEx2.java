package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers ?");
		int n = sc.nextInt();
		double vector[]= new double [n];
		double sum=0;
		for(int i = 0;i<vector.length;i++) {
			System.out.println("Write a number: ");
			vector[i]=sc.nextDouble();
		}
		System.out.println("Values: ");
		for(int i = 0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
			sum+=vector[i];
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		System.out.println("Media: "+sum/n);
	}

}
