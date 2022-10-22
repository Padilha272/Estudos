package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to have in each vector?");
		int n = sc.nextInt();
		double vector1[] = new double [n];
		double vector2[] = new double [n];
		double vector3[] = new double [n];
		System.out.println("Enter the values of the vector 1");
		for (int i = 0; i<vector1.length;i++) {
			System.out.print("Enter a number: ");
			vector1[i]=sc.nextDouble();			
		}
		System.out.println("Enter the values of the vector 2");
		for (int i = 0; i<vector2.length;i++) {
			System.out.print("Enter a number: ");
			vector2[i]=sc.nextDouble();			
		}
		for (int i = 0; i<vector3.length;i++) {
			vector3[i]=vector1[i]+vector2[i];
		}
		System.out.println("Sum vector:");
		for (int i = 0; i<vector3.length;i++) {
			System.out.println(vector3[i]);
		}
		
	}

}
