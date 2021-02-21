package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UserProduct;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Comom,used or imported? (c/u/i) ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price :");
			double price = sc.nextInt();
			if (type == 'c') {

				list.add(new Product(name, price));

			} else if (type == 'u') {
				System.out.print("Manufaturing date (d/m/y) ");
				Date ManufactureDate = sdf.parse(sc.next());
				list.add(new UserProduct(name, price, ManufactureDate));

			} else if (type == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));

			}

		}
for (Product x : list) {
	System.out.println(x.priceTag());
	
	
}
	}

}
