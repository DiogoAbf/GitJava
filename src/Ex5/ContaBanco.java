package Ex5;

import java.util.Scanner;

public class ContaBanco {
	int NumConta;
	String Titular;
	double Val0;
	char initial;

	Scanner sc = new Scanner(System.in);

	public ContaBanco() {
		System.out.println("------------------------------------------------------------");
		System.out.print("Entre com numero da conta :");
		NumConta = sc.nextInt();
		System.out.print("Entre com nome do titular :");
		sc.nextLine();
		Titular = sc.nextLine();
		System.out.print("A conta vai possuir valor inicial? :");

		initial = sc.next().charAt(0);

		if (initial == 'y') {

			System.out.print("Valor do deposito inicial: ");
			Val0 = sc.nextDouble();
			System.out.println("Conta criada com sucesso ");

		} else {

			System.out.println("Conta criada com sucesso n");

		}

		System.out.println(NumConta + "," + Titular + "," + Val0);
		System.out.println("------------------------------------------------------------");

	}

	public int getNumConta() {
		return NumConta;
	}

	public void getTitular() {
		System.out.println(Titular);
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public double getVal0() {
		return Val0;
	}

	public void deposito(double val0) {
		this.Val0 += val0;
		System.out.println("Valor atual após operação: " + this.Val0 + ", Titular: " + Titular);

	}

	public void saque(double val0) {

		if (Val0 <= 0) {

			System.out.println("impossível realizar operação , saudo negaitvo");
		} else {

			this.Val0 -= (val0);
			this.Val0 -= 5;
			System.out.println("Valor atual após operação:" + this.Val0 + ", Titular: " + Titular);
		}

	}

}
