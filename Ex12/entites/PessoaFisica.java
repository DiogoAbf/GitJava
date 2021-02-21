package entites;

public class PessoaFisica extends Pessoa {

	Double GastroSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastroSaude) {
		super(nome, rendaAnual);
		GastroSaude = gastroSaude;
	}

	@Override
	public double juros() {

		if (getRendaAnual() < 20000) {

			if ((GastroSaude != 0) && (GastroSaude != null)) {

				return ((getRendaAnual() * 0.15) - (GastroSaude * 0.5));

			} else {

				return (getRendaAnual() * 0.15);

			}

		} else if (getRendaAnual() >= 20000) {

			if ((GastroSaude != 0) && (GastroSaude != null)) {

				return (getRendaAnual() * 0.25) - (GastroSaude * 0.5);

			}
		} else {

			return (getRendaAnual() * 0.25);

		}

		return 0;
	}

}
