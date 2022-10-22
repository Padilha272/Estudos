package funcoes;

import java.util.Scanner;

public class FuncaoSintaxe {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a,b,c);
		result(higher);
		
		
		sc.close();

	}
	
	public static int max (int a,int b,int c) {
		
		int higher;
		if(a > b && a >c) {
			higher = a;
		} else if ( b>c) {
			higher = b;
		}else {
			higher = c;
		}
		return higher;
	
	}
	
	public static void result(int value) {
		/*int higher;
		if(a > b && a >c) {
			higher = a;
		} else if ( b>c) {
			higher = b;
		}else {
			higher = c;
		}*/
		System.out.println("Higher = "+value);
	}
	
	
	
}
