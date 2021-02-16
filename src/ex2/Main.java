package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.print("Entre com nome do funcionario:" );
		e1.Name = sc.nextLine();
		System.out.print("Entre com salario bruto do funcionario:");
		e1.GrossSalary = sc.nextDouble();
		System.out.println("Entre com taxa do funcionario:" );
		e1.Tax = sc.nextDouble();
		System.out.println("Funcionario:" + " "+ e1.Name +","+e1.NetSalary());
		System.out.print("Taxa pra incresentar");
		 e1.incremento = sc.nextDouble();
		
		System.out.println("Atualização:" +" "+ e1.Name + "," + e1.IncresseSalary(e1.incremento));
		
		sc.close();
		
		
	}

}
