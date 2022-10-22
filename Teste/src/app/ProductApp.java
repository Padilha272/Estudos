package app;

import java.util.Scanner;

import entities.Product;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product produto = new Product(null, 0, 0);
		System.out.print("Product name: ");		
		produto.setName(sc.nextLine());
		System.out.print("Product price:");		
		produto.setPrice(sc.nextDouble());
		System.out.print("Product quantity: ");		
		produto.setQuantity(sc.nextInt());
		sc.nextLine();
		System.out.println("Nom:");
		String nome2 = sc.nextLine();
		System.out.println("preco:");
		double preco2 = sc.nextDouble();
		Product produto2 = new Product(nome2, preco2);
		System.out.println(produto2.toString());
		System.out.println(produto.toString());
		System.out.print("Add product: ");
		int add = sc.nextInt();
		produto.addQuantity(add);
		System.out.println(produto.toString());
		System.out.print("Remove product: ");
		int remove=sc.nextInt();
		produto.removeQuantity(remove);
		System.out.println(produto.toString());

	}

}
