package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List<Product> list = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(c=='i') {
			System.out.print("Customs fee: ");	
			double custom = sc.nextDouble();
			Product product = new ImportedProduct(name,price,custom);
			list.add(product);
			}else if(c=='u') {
			System.out.print("Manufacture date: (DD/MM/YYYY): ");
			java.util.Date date =  sdf.parse(sc.next());
			Product product = new UsedProduct(name,price,date);
			list.add(product);
			}else {
				Product product = new Product(name,price);
				list.add(product);
			}			
		}
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		

	}

}
