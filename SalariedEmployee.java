package nazansonal_211805027_lab5;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		     if (weeklySalary>=0) {  
		     this.weeklySalary = weeklySalary;
		 }
	}
	@Override
	 public double getPaymentAmount() {
	     return weeklySalary;
	 }

	 @Override
	 public String toString() {
	     return "\nSalaried employee: "+getFirstName()+getLastName()+"\nSocial Security number: "+getSocialSecurityNumber()+ "\nWeekly salary: $"+ weeklySalary;
	 }
	}
	
	


