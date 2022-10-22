package comportamentoDeMemoria;

import java.util.Scanner;

public class VetorEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to type ?");
		int n = sc.nextInt();
		int vector[] = new int [n];
		int even=0;
		double average=0;
		for (int i = 0; i<vector.length;i++) {
			System.out.print("Enter a number: ");
			vector[i]=sc.nextInt();			
		}	
		for (int i = 0; i<vector.length;i++) {
			if(vector[i]%2==0) {
				even+=1;
				average+=vector[i];	
			}
		}
		average=average/even;
		if(even>0) {
			System.out.println("Average of even numbers: "+average);
		
		}else {
			System.out.println("There is no even number in the vector");
		}

	}

}
