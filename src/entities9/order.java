package entities9;

import entietsEnum.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class order {
	private Date momemt;
	private OrderStatus status;
	Client client;
	private OrderItem ordemitem;

	List<OrderItem> item = new ArrayList<>();

	public void addItem(OrderItem items) {

		item.add(items);

	}

	public void removeItem(OrderItem items) {

		item.remove(items);

	}

	public order(Date momemt, OrderStatus status, Client client) {
		super();
		this.momemt = momemt;
		this.status = status;
		this.client = client;

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMomemt() {
		return momemt;
	}

	public void setMomemt(Date momemt) {
		this.momemt = momemt;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public OrderItem getOrdemitem() {
		return ordemitem;
	}

	public void setOrdemitem(OrderItem ordemitem) {
		this.ordemitem = ordemitem;
	}

	public double geral() {
		
		double sum = 0;
		
		for(OrderItem x : item) {
			
			System.out.println(x);
			
			 sum+= x.subtotal();
			
		}
		
		return sum;
	}
}
