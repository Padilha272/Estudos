package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to type ?");
		int n = sc.nextInt();
		int vector[] = new int [n];
		int even=0;
		for (int i = 0; i<vector.length;i++) {
			System.out.print("Enter a number: ");
			vector[i]=sc.nextInt();			
		}
		System.out.println("Even numbers: ");
		System.out.print("[");
		for (int i = 0; i<vector.length;i++) {
			if(vector[i]%2==0) {
				even+=1;
				System.out.print(vector[i]+" ");
			}
		}
		System.out.println("]");
		System.out.println("Quantity of even numbers: "+even);
	}

}
