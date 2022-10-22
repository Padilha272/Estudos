package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		double vetor[] = new double[n];
		double n1=0.00,n2=0.00,n3=0.00;
		for(int i=0;i<n;i++) {
			System.out.println("Nota 1");
			n1=leia.nextDouble();
			System.out.println("Nota 2");
			n2=leia.nextDouble();
			System.out.println("Nota 3");
			n3=leia.nextDouble();
			vetor[i]=((n1*2)+(n2*3)+(n3*5))/10;
		}
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f%n",vetor[i]);
		}
	}

}
