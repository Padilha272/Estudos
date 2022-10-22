package estruturasRepetitivas;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		int in=0,out=0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero");
			int numero =leia.nextInt();
			if(numero >=10 && numero<=20) {
				in+=1;
			}else {
				out+=1;
			}
		}
		System.out.println("In: "+in);
		System.out.println("Out: "+out);
	}

}
