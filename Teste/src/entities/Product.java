package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity =0;//opcional
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double value(double price,int quantity) {
		return price*quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	
	public String toString(){
		return "Product: "+name+"| price: "+String.format("$ %.2f", price)+"| Quantity: "+quantity+String.format("| Total: $ %.2f",value( price, quantity));
	}
	
	
}
