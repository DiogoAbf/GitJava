package entities;

public class Produto {
	
	String name;
	double price;
	int quanty;
	
	public void TotalValueStock() {
		
		System.out.println(quanty);
	}
	
	public void AddProducts(int quanty) {
		
		this.quanty = this.quanty + quanty;

	}


public void RemoveProducts(int quanty) {
		
		this.quanty = this.quanty - quanty;

	}

}
