package entities9;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	

	

	

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subtotal() {
		
	
		
		return quantity*price;
		
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

	
}
