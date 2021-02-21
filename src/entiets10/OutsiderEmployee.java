package entiets10;

public class OutsiderEmployee extends Employee {

	Double addtionalCharge;

	public OutsiderEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	@Override
	public Double payment() {

		double sum = 0;
		sum += ((super.payment()) + addtionalCharge) + (1.1 * addtionalCharge);

		return sum;

	}

	@Override
	public String toString() {
		return "OutsiderEmployee [addtionalCharge=" + addtionalCharge + ", name=" + name + ", hours=" + hours
				+ ", valuePerHour=" + valuePerHour + "]";
	}
	
	

}
