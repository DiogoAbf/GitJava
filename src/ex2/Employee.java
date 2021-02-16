package ex2;

public class Employee {
	String Name;
	double GrossSalary; 
    double Tax;
    double incremento;
    
    public double NetSalary() {
		return (this.GrossSalary-this.Tax);

	}
    
    public double IncresseSalary(double incremento) {
    	return (this.NetSalary() + ((incremento)/100)*(this.NetSalary()));

	}
}
