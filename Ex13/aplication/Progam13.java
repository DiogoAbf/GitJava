package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Acount;


public class Progam13 {

	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Acount acc = new Acount(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}
}