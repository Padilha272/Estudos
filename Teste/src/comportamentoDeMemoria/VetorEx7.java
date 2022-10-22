package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers ?");
		int n = sc.nextInt();
		double vector[]= new double [n];
		double sum=0;
		for(int i = 0;i<vector.length;i++) {
			System.out.println("Write a number: ");
			vector[i]=sc.nextDouble();
			sum+=vector[i];
		}
		sum= sum/n;
		System.out.println("Vector's average: "+sum);
		System.out.println("Numbers below average: ");
		for(int i = 0; i<vector.length;i++) {
			if(vector[i]<sum) {
				System.out.println(vector[i]);
			}
		}

	}

}
