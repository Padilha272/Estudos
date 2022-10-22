package estruturasRepetitivas;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		while(senha !=2002) {
			System.out.println("Senha invalida");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido");
		
		
		
		sc.close();

	}

}
