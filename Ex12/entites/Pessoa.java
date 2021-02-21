package entites;

public abstract class Pessoa {

	String nome;
	Double RendaAnual;

	public abstract double juros();

	

	public Pessoa(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		RendaAnual = rendaAnual;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return RendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		RendaAnual = rendaAnual;
	}

}
