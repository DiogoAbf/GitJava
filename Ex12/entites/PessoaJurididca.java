package entites;

public class PessoaJurididca extends Pessoa {

	Integer NumeroFuncionario;

	public PessoaJurididca(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		NumeroFuncionario = numeroFuncionario;
	}

	@Override
	public double juros() {

		if (NumeroFuncionario < 10) {

			return getRendaAnual() * 0.16;

		} else {

			return (getRendaAnual() * 0.14);

		}
	}
}
