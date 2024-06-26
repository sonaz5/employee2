package nazansonal_211805027_lab5;
public class test {
 public static void main(String[] args) {
     
     payable[] payableObjects = new payable[6];

     payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
     payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
     payableObjects[2] = new SalariedEmployee("Ayşe ", "İlhan", "137-51-0567", 650.00);
     payableObjects[3] = new HourlyEmployee("Ali ", "Yılmaz", "649-22-7718", 22.75, 40);
     payableObjects[4] = new CommisionEmployee("Dila ", "Demir", "383-13-4923", 11250.00, 0.08);
     payableObjects[5] = new BasePlusCommissionEmployee("Harun ", "Aydoğan", "578-19-4560", 5500.00, 0.07, 600.00);

     System.out.println("------ Invoices and Employees processed polymorphically:------");
    
     for (int i = 0; i < payableObjects.length; i++) {
         System.out.println(payableObjects[i]);
         if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
             BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) payableObjects[i];
             employee.increaseBaseSalary();
             System.out.printf("New base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
             
         }
         System.out.println("Payment amount: $" + payableObjects[i].getPaymentAmount());
         System.out.println();
         
     }
     for (int a = 0; a < payableObjects.length; a++) {
     System.out.println("Payable object " + a + " is a " + payableObjects[a].getClass().getSimpleName());
 }
}
}