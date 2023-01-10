public class HourlyEmployee extends Employee {
   private double wages;
   private double hours;

   public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wages, double hours){
      super(firstName, lastName, socialSecurityNumber);

      if(wages < 0.0){
         throw new IllegalArgumentException("wages must be >= 0.0");
      }

      if(hours < 0.0 || hours > 168.0){
         throw new IllegalArgumentException("Hours must be >= 0.0 and Hours must be <= 168.0");
      }
      this.wages = wages;
      this.hours = hours;
   }

   public double getHours(){
      return hours;
   }

   public void setHours(double hours){
      this.hours = hours;
   }

   public double getWages(){
      if(hours < 0.0 || hours > 168.0){
         throw new IllegalArgumentException("Hours must be >= 0.0 and Hours must be <= 168.0");
      }
      return wages;
   }

   public void setWages(){
      if(wages < 0.0){
         throw new IllegalArgumentException("wages must be >= 0.0");
      }
      this.wages = wages;
   }

   @Override
   public double earnings(){
      if(getHours() <= 40.0){
         return getWages() * getHours();
      }
      return getWages() * getHours() + (getHours() - 40) * getWages() * 1.5;
   }

   @Override
   public String toString(){
      return String.format("%nHourly employee %s%n%s: $%,.2f%n%s: %,.2f", super.toString(),
         "Hourly wage", getWages(), "Hourly worked", getHours());
   }
}
