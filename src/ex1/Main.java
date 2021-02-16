package ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	Rectangle r1 = new Rectangle();
	
	
	System.out.println("Enter whit the weight and largue of rectangle:");	
	r1.Heigth=sc.nextInt();
	r1.Width =sc.nextInt();
	r1.area();
	r1.diagonal();
	r1.perimetro();
	
	
		
		
		
		
	}
}
