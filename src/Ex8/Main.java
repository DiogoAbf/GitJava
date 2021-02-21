package Ex8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Criando instancias
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		
		
		System.out.print("Entre com o nome do departamento: ");
		String dp = sc.nextLine();
		System.out.println("Entre com as informações do trabalhador ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine(); 
		System.out.print("Salario base: ");
		int salario = sc.nextInt();
		
		
	Trabalhador t1 = new Trabalhador(name, salario,Level.valueOf(level),new Departamento(dp));

		
		System.out.print("Quantos trabalhos ele fez: ");
		int n = sc.nextInt();
		
		for(int i = 0; i <n ; i++) {
			
			System.out.println("Entre com os dados" + "#" + (i+1));
			System.out.println("Data: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			int valor = sc.nextInt();
			System.out.println("Horas Trabalhadas: ");
			double horas = sc.nextDouble();
			
			HorasContrato hc = new HorasContrato(contractDate,horas,valor);
			
		   t1.addcontrato(hc);
			
			
			
			
		}
		
		System.out.println("Entre com a data final : ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + t1.getName());
		System.out.println("Department: " + t1.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", t1.income(year, month)));
		
		
		sc.close();
		
		
		
		

	}

}
