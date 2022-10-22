package estruturasRepetitivas;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a coordenada em X: ");
		int x = sc.nextInt();
		System.out.printf("Digite a coordenada em Y: ");
		int y = sc.nextInt();
				
		while(x!=0 && y!=0) {
			
			if(x > 0 && y > 0 ) {
				System.out.println("Primeiro");
			} else if (x < 0 && y>0) {
				System.out.println("Segundo");
			} else if(x<0 && y<0) {
				System.out.println("Terceiro");
			}else if(x>0 && y<0) {
				System.out.println("Quarto");
			}
			System.out.printf("Digite a coordenada em X: ");
			 x = sc.nextInt();
			System.out.printf("Digite a coordenada em Y: ");
			 y = sc.nextInt();
		}

	}

}
