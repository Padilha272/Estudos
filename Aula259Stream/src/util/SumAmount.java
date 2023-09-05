package util;

import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class SumAmount implements Consumer<List<Product>>{

	


	@Override
	public void accept(List<Product> p) {
		int c=p.size();
		double sum=0.00;
		
		for(Product item : p) {
			sum+=item.getPrice();
		}
		System.out.printf("Average value: %.2f",(sum/c));
	}

	

}
