package entites;

import java.util.Date;

public class UserProduct extends Product {
	
	Date ManufactureDate;
	
	

	@Override
	public String priceTag() {
		return super.priceTag()+
		"(used)" +getManufactureDate() + "\n"; 
			
			
		}

	public UserProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	

}
