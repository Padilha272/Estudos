package comportamentoDeMemoria;

import java.util.Scanner;

import entities.ClientePensionato;

public class PensionatoEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClientePensionato vect[]=new ClientePensionato [10];
		int j =0;
		for(int i =0;i<vect.length;i++) {
			vect[i]=new ClientePensionato("","");
		}
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<n;i++) {
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			int verdadeiro=0;
			do {				
			
			System.out.print("Room: ");
			int numero = sc.nextInt();		
			if(vect[numero].getNome()=="" && vect[numero].getEmail()=="") {
				System.out.println("Cliente registrado!");
				vect[numero].setNome(name);
				vect[numero].setEmail(email);
				verdadeiro=1;
			}else {
				System.out.println("Quarto ocupado!");
	
			}
			sc.nextLine();
			}while(verdadeiro!=1);
		}
		System.out.println("Busy rooms: ");
		for(int i =0;i<vect.length;i++) {
		if(vect[i].getNome()!="" && vect[i].getEmail()!="") {
			System.out.println(i+": "+vect[i].getNome()+", "+vect[i].getEmail());
		}
		}
		
	}

}
