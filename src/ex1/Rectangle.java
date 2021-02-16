package ex1;

public class Rectangle {
	double Width;
	double Heigth;
	
	public void area() {
		System.out.println(Width*Heigth); 
	}
	public void perimetro() {
		System.out.println((Width*2)+(Heigth*2)); 
	}

	public void diagonal() {
		System.out.println(Math.sqrt((Width*Width) + (Heigth*Heigth))); 
	}


}
