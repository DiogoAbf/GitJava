package Ex8;
import java.util.Date;

public class HorasContrato {
	private Date data;
	private Double ValorHoras;
	private Integer Horas;
	
	
	public double totalValue() {
		return ValorHoras * Horas;
	}
	
	
	
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorHoras() {
		return ValorHoras;
	}


	public void setValorHoras(Double valorHoras) {
		ValorHoras = valorHoras;
	}


	public Integer getHoras() {
		return Horas;
	}


	public void setHoras(Integer horas) {
		Horas = horas;
	}


	public HorasContrato() {
		
	}

	
	public double TotalValue() {
		
		
		
		return  (Horas*ValorHoras);
	}


	public HorasContrato(Date date, Double valorHoras, Integer horas) {
		super();
		data = date;
		ValorHoras = valorHoras;
		Horas = horas;
	}


	@Override
	public String toString() {
		return "HorasContrato [data=" + data + ", ValorHoras=" + ValorHoras + ", Horas=" + Horas + "]";
	}

	
}
