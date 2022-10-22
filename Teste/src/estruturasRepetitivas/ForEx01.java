package estruturasRepetitivas;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = leia.nextInt();
		for(int i=1;i<x;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
