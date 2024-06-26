package nazansonal_211805027_lab5;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if (wage>=0) 
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		if (hours>= 0 || hours < 168) {
			this.hours = hours; 
	     }
	}
	 @Override
	 public double getPaymentAmount() {
	     if (hours <= 40) {
	        return  wage * hours; 
	        }
	     else {
	         return  40 * wage + (hours - 40) * wage * 1.5;
	     }
	 }
	     @Override
	     public String toString() {
	         return "\nHourly employee:"+getFirstName() +getLastName() +"\nSocial security number: "+getSocialSecurityNumber()+"\nHourly Wage: "+wage+"\nHours worked: "+hours;
	     }
}
