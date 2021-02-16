package entities;

public class Main {
	public static void main(String[] args) {
	Produto p1 = new Produto();
	p1.name = "Biscoito";
	p1.quanty = 10;
	p1.TotalValueStock();
	p1.AddProducts(5);
	p1.TotalValueStock();
	p1.RemoveProducts(6);
	p1.TotalValueStock();
	
	
	}
}
