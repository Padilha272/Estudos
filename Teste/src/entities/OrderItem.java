package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Integer quantity;
	private double price;
	
	Productx produto = new Productx();
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Double subTotal() {
		return this.quantity*produto.getPrice();
		
		
	}
	
	
}
