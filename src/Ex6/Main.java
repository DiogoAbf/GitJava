package Ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos?");
		int n = sc.nextInt();
		Hotel[] vect = new Hotel[n];
		
		for(int i = 0;i<vect.length;i++) {
			System.out.println("Nome do hospede: " + (i+1)+ " ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			
			vect[i] = new Hotel(i,name,email,room);
			
			
		}
		
		for(int i = 0;i<vect.length;i++) {
			System.out.println("======================================");
			System.out.println("Id: " + (vect[i].getId()+1));
			System.out.println("Nome hospede: " + vect[i].getName());
			System.out.println("Email: " + vect[i].getEmail());
			System.out.println("Sala: " + vect[i].getRoom());
			System.out.println("======================================");
		}
		
	}

}
