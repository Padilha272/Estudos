package application;

import java.util.Scanner;

import entities.PrintService;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		System.out.print("how many values ? ");
		 int repete = sc.nextInt();
		 sc.nextLine();
		 for(int i = 0;i<repete;i++) {
			 System.out.print("Tipe the "+(i+1)+"st number: ");
			 int value=sc.nextInt();	 	
			 ps.addValue(value);			 					 		
		 }	
		 ps.print();		 
		 System.out.println("First: "+ps.first());

	}

}
