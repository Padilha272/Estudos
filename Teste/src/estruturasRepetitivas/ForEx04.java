package estruturasRepetitivas;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		double a,b;
		
		for(int i=0;i<n;i++) {
			System.out.println("Primeiro numero:");
			a=leia.nextDouble();
			System.out.println("Segundo numero:");
			b=leia.nextDouble();
			if(b==0) {
				System.out.println("Divisao impossivel");
			}else {
				System.out.printf("%.2f%n",(a/b));
			}
		}

	}

}
