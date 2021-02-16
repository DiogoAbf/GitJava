package Ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Numeros de funcionarios: ");

		int n = sc.nextInt();

		List<Funcionarios> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Nome do Funcionário: " + (i + 1) + " ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("id: ");
			int id = sc.nextInt();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			Funcionarios fun = new Funcionarios(name, id, salario);

			list.add(fun);
			
			

		}
		
		
		for (Funcionarios x : list) {
			
			System.out.println(x);
		}
		
		System.out.println("Entre com o id do funcionario que vai receber aumento: ");
		int idsalary = sc.nextInt();
		Integer pos = hasid(list,idsalary);
		if(pos == null) {
			System.out.println("id não existe");
			
		}else {
			
			System.out.println("Entre com a porcetagem: ");
			int percent = sc.nextInt();
			list.get(pos).AumentoSalario(10);
			System.out.println("Novo salario: " + list.get(pos).getSalario() );
			
		}
		
		
				
				
			
			
			
			
		}
		
			
	public static Integer hasid(List<Funcionarios>list, int id) {
		for(int i =0;i<list.size();i++ ) {
			if(list.get(i).getId() == id) {
				return i;
				
				
			}
			
			
			
		}
		return null;
		
	}
		

	}




