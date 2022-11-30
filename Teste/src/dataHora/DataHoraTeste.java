package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

public class DataHoraTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o dia");
		String dia = sc.nextLine();
		System.out.println("Digite o mes");
		String mes = sc.nextLine();
		System.out.println("Digite o ano");
		String ano = sc.nextLine();
		
		LocalDate d01 = LocalDate.parse(ano+"-"+mes+"-"+dia);
		System.out.println(d01);
		Instant d02 = Instant.now();
		System.out.println(d02);
		

	}

}
