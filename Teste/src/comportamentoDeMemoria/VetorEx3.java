package comportamentoDeMemoria;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class VetorEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people ?");
		int n = sc.nextInt();
		Person vector[] = new Person[n];
		double averageheight = 0;
		double amount=0;
		int older=0;
		for(int i = 0;i<vector.length;i++) {
			sc.nextLine();
			vector[i]=new Person("",0,0);
			System.out.println("Write the person's name: ");
			vector[i].setNome(sc.nextLine());
			System.out.println("Write the person's age: ");
			vector[i].setIdade(sc.nextInt());
			System.out.println("Write the person's height: ");
			vector[i].setAltura(sc.nextDouble());		
		}
		for(int i = 0;i<vector.length;i++) {
			averageheight+=vector[i].getAltura();
			
		}
		for(int i = 0;i<vector.length;i++) {
			if(vector[i].getIdade()<16) {
				amount+=1;
			}
			if(vector[i].getIdade()>older) {
				older=vector[i].getIdade();
			}
		}
		System.out.printf("Average height:  %.2f\n",averageheight/n);
		System.out.printf("People with less than 16 years: %.1f%%%n",(amount/n)*100);
		for(int i = 0;i<vector.length;i++) {
			if(vector[i].getIdade()<16) {
				System.out.println(vector[i].getNome());
			}			
		}
		for(int i = 0;i<vector.length;i++) {
			if(vector[i].getIdade()==older) {
				System.out.println("Oldest person: "+vector[i].getNome());
			}
		}
		
	}

}
