package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program255 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Predicate<Product> pred = p -> p.getPrice()>=100;
		
		//list.removeIf(new ProductPredicate());
		//other option(Method reference"::") : list.removeIf(Product::staticProductPredicate);
		//other option list.removeIf(Product::nonstaticProductPredicate);
		//list.removeIf(pred);
		list.removeIf(p -> p.getPrice()>=100);
		
		for(Product item : list) {
			item.increment1();
		}
	
		for(Product item : list) {
			System.out.println(item);
		}

	}

}
