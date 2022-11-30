package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderEx {
	
	private Date moment;
	private OrderStatus status;
	
	
	List <OrderItem> orderitem = new ArrayList<>();

	public OrderEx(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderitem() {
		return orderitem;
	}

	public void addItem(OrderItem item) {
		orderitem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderitem.remove(item);
	}
	
	
	
	public Double total() {
		double valor =0;
		for(OrderItem c : orderitem) {
			valor = valor+c.subTotal();
		}
		return valor;
	}
	
	
	
	
	
	
}
