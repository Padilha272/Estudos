package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice()>=100;
	}
	
	public boolean nonstaticProductPredicate() {
		return price >=100;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice()*1.1);
	}
	
	public void nonStaticPriceUpdate() {
		setPrice(getPrice()*1.1);
	}
	
	
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	public  String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		 return String.format("%s, %.2f", name, price);
	}

	@Override
	public int compareTo(Product o) {
		return this.getPrice().compareTo(o.getPrice());
	}
	
	
	
}