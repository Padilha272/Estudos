package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers ?");
		int n = sc.nextInt();
		int vector[]= new int [n];
		for(int i = 0;i<vector.length;i++) {
			System.out.println("Write a number: ");
			vector[i]=sc.nextInt();
		}
		System.out.println("Negative numbers");
		for(int i = 0;i<vector.length;i++) {
			if(vector[i]<0) {
				System.out.println(vector[i]);
			}
			
		}

	}

}
