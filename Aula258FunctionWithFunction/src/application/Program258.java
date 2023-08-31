package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;


public class Program258 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		List<Product> list2 = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		ProductService ps= new ProductService();
		System.out.printf("Sum: %.2f",ps.filteredSum(list,p->p.getPrice()<=100));
		

	}

}