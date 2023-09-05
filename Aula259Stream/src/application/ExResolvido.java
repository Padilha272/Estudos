package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.SumAmount;

public class ExResolvido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "c:\\temp\\in.txt";
		
		try {
			List<Product> lista = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while(line!=null) {
				line = line.trim();
				if(!line.isEmpty()) {
					String slice[]=line.split(",");
					lista.add(new Product(slice[0],Double.parseDouble(slice[1])));
				}
				line = br.readLine();
			}
			double avg = lista.stream().map(p->p.getPrice()).reduce(0.0,(x,y)->x+y)/lista.size();
			
			System.out.println("Average price: "+String.format("%.2f", avg));
			
			Comparator<String> comp = (s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = lista.stream().filter(p->p.getPrice()<avg).map(n->n.getName())
					.sorted(comp.reversed()).collect(Collectors.toList());
			
			names.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: "+e.getMessage());
		}

	}

}
