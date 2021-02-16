package Ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

	
	System.out.print("Valor do dolar?" );
	 double v = sc.nextDouble();
	 System.out.print("Quantos dolares?" );
	 double q = sc.nextDouble();
	 
	
	 ConversorDolar.convertar(v,q);
	}

}
