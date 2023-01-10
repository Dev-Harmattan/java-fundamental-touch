public class SalariedEmployee extends Employee {
   private double weeklySalary;

   public SalariedEmployee(String firstName, String lastName, String socialNumberSecurity, double weeklySalary){
      super(firstName, lastName, socialNumberSecurity);

      if(weeklySalary < 0.0){
         throw new IllegalArgumentException("Weekly salary must be >= 0.0");
      }
      this.weeklySalary = weeklySalary;
   }

   public double getWeeklySalary(){
      return weeklySalary;
   }

   public void setWeeklySalary(double weeklySalary){
      if(weeklySalary < 0.0){
         throw new IllegalArgumentException("Weekly salary must be >= 0.0");
      }
      this.weeklySalary = weeklySalary;
   }

   @Override
   public double earnings(){
      return weeklySalary;
   }

   @Override
   public String toString(){
      return String.format("%nSalaried employee %s%n%s: $%,.2f", super.toString(), "Weekly salary", getWeeklySalary());
   }
}
