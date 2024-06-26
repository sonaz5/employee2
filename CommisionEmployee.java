package nazansonal_211805027_lab5;

public class CommisionEmployee extends Employee{
	private double grossSales;
	 private double commissionRate;
	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		if(grossSales>=0)
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		if(commissionRate>0 || commissionRate<1)
		this.commissionRate = commissionRate;
	}
	 
	@Override
	 public double getPaymentAmount() {
	     return grossSales * commissionRate;
	 }
	 @Override
	 public String toString() {
	     return "\nCommission employee:"+getFirstName() +getLastName()+"\nSocial Security number: "+getSocialSecurityNumber()+"\nGross sales: "+grossSales+"\nCommission rate: "+commissionRate;
	 }
}
