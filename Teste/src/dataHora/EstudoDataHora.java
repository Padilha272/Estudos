package dataHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EstudoDataHora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime data1 =  LocalDateTime.now();
		System.out.println(data1.format(fmt2));
		
		
		
		/*System.out.print("Digite o dia: ");
		String dia = sc.nextLine();
		System.out.print("Digite o mês: ");
		String mes = sc.nextLine();
		System.out.print("Digite o ano: ");
		String ano =  sc.nextLine();
		LocalDate t1 = LocalDate.parse(ano+"-"+mes+"-"+dia);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(t1.format(fmt1));*/

	}

}
