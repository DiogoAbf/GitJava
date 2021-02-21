package aplication;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Pessoa;
import entites.PessoaFisica;
import entites.PessoaJurididca;

public class Progam12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Entre com numero de contribuintes: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Pagador numero " + "#" + (i + 1));
			sc.nextLine();
			System.out.print("Pessoa fisica ou juridica? (f/j) ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual :");
			double rendaAnual = sc.nextDouble();
			if (type == 'f') {

				System.out.println("Gasto com Saude:");

				double gastroSaude = sc.nextDouble();

				list.add(new PessoaFisica(nome, rendaAnual, gastroSaude));

			} else if (type == 'j') {
				System.out.print("Numero de Funcionarios:  ");

				int numeroFuncionario = sc.nextInt();

				list.add(new PessoaJurididca(nome, rendaAnual, numeroFuncionario));
			}

		}
		
		System.out.println("Taxas: ");
		for (Pessoa x : list) {
			System.out.println(x.juros());
			
		}
	}
}
