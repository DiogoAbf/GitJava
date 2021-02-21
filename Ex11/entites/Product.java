package entites;

public class Product {
	String name;
	Double Price;
	
	
	
	
	public String priceTag() {
		

		
	return	getName() +" $ " + getPrice();
		
		
	}
	
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		Price = price;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
	

}

