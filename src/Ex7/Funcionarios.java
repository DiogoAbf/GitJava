package Ex7;

public class Funcionarios {

	private String name;
	private Integer id;
	private Double salario;

	public Funcionarios(String name, Integer id, Double salario) {
		super();
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void AumentoSalario(int porcetagem) {

		salario += (salario) * (porcetagem / 100);

	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);

	}

}
