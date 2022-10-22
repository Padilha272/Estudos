package estruturasRepetitivas;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool=0, gasolina=0,diesel=0;
		System.out.println("----------------------------");
		System.out.println("Posto Texaco");
		System.out.println("1-Alcool");
		System.out.println("2-Gasolina");
		System.out.println("3-Diesel");
		System.out.println("4-Fim");
		System.out.println("----------------------------");
		System.out.print("Digite o tipo de combustível: ");
		int resp = sc.nextInt();
		while(resp!=4) {			
			if(resp==1) {
				alcool+=1;
			}else if(resp==2) {
				gasolina+=1;
			}else if(resp==3) {
				diesel+=1;
			}
			System.out.println("----------------------------");
			System.out.println("Posto Texaco");
			System.out.println("1-Alcool");
			System.out.println("2-Gasolina");
			System.out.println("3-Diesel");
			System.out.println("4-Fim");
			System.out.println("----------------------------");
			System.out.print("Digite o tipo de combustível: ");
			resp = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
	}

}
