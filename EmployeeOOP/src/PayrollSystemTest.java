public class PayrollSystemTest {
   public static void main(String[] args){
      SalariedEmployee salariedEmployee =
         new SalariedEmployee("Joe", "Ken", "1111-1111-1111", 569.00);
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Yen", "Blue", "2222-2222-2222", 50.00, 30);
      CommissionEmployee commissionEmployee =
         new CommissionEmployee("Frank", "Smith", "333-333-333", 900, 0.6);
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee("Leo", "messi", "444-444-444", 600, 0.06, 400);

      System.out.println("Employee process individually");

      System.out.printf("%n%s%n%s: $%,.2f", salariedEmployee, "Earned", salariedEmployee.earnings());
      System.out.printf("%n%s%n%s: $%,.2f", hourlyEmployee, "Earned", hourlyEmployee.earnings());
      System.out.printf("%n%s%n%s: $%,.2f", commissionEmployee, "Earned", commissionEmployee.earnings());
      System.out.printf("%n%s%n%s: $%,.2f", basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.earnings());

      Employee[] employees = new Employee[4];

      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("%n%nEmployee process polymorphically:");

      for(Employee currentEmployee: employees){
         System.out.printf("%n%s%n", currentEmployee);

         if(currentEmployee instanceof BasePlusCommissionEmployee){
            BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * employee.getBaseSalary());
            System.out.printf("New base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
         }
         System.out.printf("Earned: $%,.2f", currentEmployee.earnings());
      }

      for(int j = 0; j < employees.length; j++){
         System.out.printf("%nEmployee in index %d is %s%n", j, employees[j]);
      }

   }
}
