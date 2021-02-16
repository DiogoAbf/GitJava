package Ex3;

public class Aluno {
	
	double nota;
	String nome;
	
	public double Geral(double n1,double n2,double n3) {
		double soma =n1+n2+n3 ;
		return soma;
		

	}
public void Passou(double soma , String nome) {
	if((soma)/3 > 6) {
		
		System.out.println("O aluno :" + nome + ", Passou");
	
	} else {
		
		System.out.println("O aluno : " + nome +  " Não passou" + " Falata " + ((18 - (soma))));
	}
	
}
}
