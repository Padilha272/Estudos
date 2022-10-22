package estruturasRepetitivas;

import java.util.Scanner;

public class ForEx05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = leia.nextInt();
		int i = 0;
		int valor = x;
		if (x == 0) {
			valor = 1;
		} else {
			for (i = 1; i < x; i++) {
				valor = valor * (x - i);

			}
		}

		System.out.println(valor);
	}

}
