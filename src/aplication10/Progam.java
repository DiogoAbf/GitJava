package aplication10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entiets10.Employee;
import entiets10.OutsiderEmployee;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number employees: ");
		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < n; i++) {

			System.out.print("Outsider? (y/n)");
			char ot = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hours: ");
			double value = sc.nextInt();

			if (ot == 'y') {

				System.out.println("Addtional Charge: ");
				double addtionalCharge = sc.nextInt();
				
				list.add(new OutsiderEmployee(name, hours, value, addtionalCharge));

				

				

			}

			if (ot == 'n') {

				

				list.add(new Employee(name, hours, value));

			}

		}
		for (Employee x:list) {
			
			System.out.println(x);
			System.out.println(x.payment());
			
		}

		
			
		}
		
		

	}


