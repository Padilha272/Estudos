package comportamentoDeMemoria;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ordem da matriz: ");
		int n = sc.nextInt();
		int array[][]= new int[n][n];
		int negativos=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Digite um número: ");
				array[i][j]= sc.nextInt();
			}
		}
		System.out.println("--------------------");
		System.out.println("Matriz: ");
		for(int i=0;i<n;i++) {
			System.out.print("[ ");
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
			
		}
		System.out.println("--------------------");		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(array[i][j]<0) {
					negativos+=1;
				}
			}			
		}
		System.out.println("Numeros negativos: "+negativos);
		System.out.println("--------------------");
		System.out.println("Diagonal Principal: ");
		for(int i=0;i<n;i++) {
			System.out.print("[ ");
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print(array[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("]");
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
