package nazansonal_211805027_lab5;

public class BasePlusCommissionEmployee extends CommisionEmployee{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary>=0)
		this.baseSalary = baseSalary;
	}
	public void increaseBaseSalary() {
	     baseSalary *= 1.1; 
	 }

	 @Override
	 public double getPaymentAmount() {
	     return (getCommissionRate()*getGrossSales())+baseSalary;
	 }

	 @Override
	 public String toString() {
	     return "\nBase salaried commission employee: "+getFirstName()+getLastName()+"\nSocial Security number: "+getSocialSecurityNumber()+"\nGross Sales: "+getGrossSales()+"\nCommission Rate: "+getCommissionRate()+"\nBase salary: "+baseSalary;
	     }
}
