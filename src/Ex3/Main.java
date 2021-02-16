package Ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno al1 = new Aluno();
		double soma = al1.Geral(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		al1.Passou(soma, "Diogo");
		

	}

}
