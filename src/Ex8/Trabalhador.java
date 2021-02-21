package Ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
public class Trabalhador {
	private  String name;
	private double salariobase;
	private Level LevelTrabalhador;
	private Departamento department;
	
	public Departamento getDepartment() {
		return department;
	}


	public void setDepartment(Departamento department) {
		this.department = department;
	}


	
	
	




	public Trabalhador(String name, double salariobase, Level levelTrabalhador, Departamento department) {
		super();
		this.name = name;
		this.salariobase = salariobase;
		LevelTrabalhador = levelTrabalhador;
		this.department = department;
	}









	List<HorasContrato> list = new ArrayList<>();


	public void addcontrato(HorasContrato contrato) {
		
		
		list.add(contrato);
		
	}


	public  String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalariobase() {
		return salariobase;
	}


	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}


	public Level getLevelTrabalhador() {
		return LevelTrabalhador;
	}


	public void setLevelTrabalhador(Level levelTrabalhador) {
		LevelTrabalhador = levelTrabalhador;
	}

	
	
	public double income(int year, int month) {
		double sum = salariobase;
		Calendar cal = Calendar.getInstance();
		for (HorasContrato c : list) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}


	
	
	
	
	

}
