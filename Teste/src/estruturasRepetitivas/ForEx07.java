package estruturasRepetitivas;

import java.util.Scanner;

public class ForEx07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		for (int i=1;i<=5;i++) {
			System.out.println(i+" "+i*i+" "+i*i*i);
		}

	}

}
