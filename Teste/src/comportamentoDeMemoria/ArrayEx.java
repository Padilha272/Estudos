package comportamentoDeMemoria;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite x: ");
		int x = sc.nextInt();
		System.out.println("Digte y: ");
		int y=sc.nextInt();
		int array[][]= new int[x][y];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Digite um número:");
				int n = sc.nextInt();
				array[i][j]=n;
				
			}
		}

		
		for(int i=0;i<array.length;i++) {
			System.out.print("[ ");
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");				
			}
			System.out.print("]");
			System.out.println();
		}
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		for(int i=0;i<array.length;i++) {	
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]==numero) {
					if(j>0) {
						System.out.println("Esquerda:"+array[i][j-1]);
					}
					if(i>0) {
						System.out.println("Cima:"+array[i-1][j]);
					}
					if(j<array[i].length-1) {
						System.out.println("Direita:"+array[i][j+1]);
					}
					if(i<array[j].length-1) {
						System.out.println("Baixo:"+array[i+1][j]);
					}
					
					/*System.out.println("Direita:"+array[i][j+1]);
					System.out.println("Esquerda:"+array[i][j-1]);
					System.out.println("Cima:"+array[i-1][j]);
					System.out.println("Baixo:"+array[i+1][j]);*/
			
				}
			}			
		}
		
		
	}

}
