package aplication9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Ex8.Level;
import entietsEnum.OrderStatus;
import entities9.Client;
import entities9.OrderItem;
import entities9.Product;
import entities9.order;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");

		String name = sc.nextLine();
		System.out.print("email: ");

		String email = sc.nextLine();

		System.out.print("Birth Date: ");
		Date birt = sdf.parse(sc.next());

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();

		order od = new order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birt));

		System.out.print("How many itens to this order? "); //15/03/1985

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter #" + (i + 1) + " item data:");
			sc.nextLine();
			System.out.print("Product name:");

			String productname = sc.nextLine();

			System.out.print("Product price:");

			double procutprice = sc.nextDouble();

			System.out.print("Quantity:");

			int procutquantity = sc.nextInt();

			OrderItem oi = new OrderItem(procutquantity, procutprice, new Product(productname, procutprice));

			od.addItem(oi);

		}

		System.out.println("Order Sumarry: ");

		System.out.print("Order Moment:");

		System.out.println(od.getMomemt());

		System.out.print("Status: ");

		System.out.println(od.getStatus());

		System.out.print("Cliente: ");

		System.out.println(od.getClient().toString());

		System.out.print("Order Itens: ");
		
		

		System.out.println(od.geral());

	}

}
