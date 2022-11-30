package app;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import entities.OrderEx;
import entities.OrderItem;
import entities.Productx;
import entities.enums.OrderStatus;

public class OrderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estado do pedido: ");
		String orderStatus = sc.nextLine();
		Date d01 = new Date();
		OrderEx order = new OrderEx(d01,OrderStatus.valueOf(orderStatus));
		System.out.println("Quantos produtos ?");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<n;i++){
		System.out.println("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Preço do produto:");
		Double preco = sc.nextDouble();
		Productx produto = new Productx(nome,preco);
		System.out.println("Quantidade:");
		Integer quantidade = sc.nextInt();
		OrderItem orderitem = new OrderItem();
		orderitem.setQuantity(quantidade);
		orderitem.setPrice(preco);
		System.out.println(orderitem.subTotal());
		}
		System.out.println("Total: "+order.total());
	}

}
