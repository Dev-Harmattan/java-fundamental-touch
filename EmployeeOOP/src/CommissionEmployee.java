public class CommissionEmployee extends Employee {
   private double grossSales;
   private double commissionRate;

   public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
      super(firstName, lastName, socialSecurityNumber);
      if(grossSales < 0.0){
         throw new IllegalArgumentException("Gross sales must be >= 0");
      }

      if(commissionRate <= 0.0 || commissionRate >= 1.0){
         throw new IllegalArgumentException("Commission rate must > 0.0 and < 1.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }


   public double getGrossSales(){
      return this.grossSales;
   }

   public void setGrossSales(double grossSales){
      if(grossSales < 0.0){
         throw new IllegalArgumentException("Gross sales must be >= 0");
      }
      this.grossSales = grossSales;
   }

   public double getCommissionRate(){
      return this.commissionRate;
   }

   public void setCommissionRate(double commissionRate){
      if(commissionRate <= 0.0 || commissionRate >= 1.0){
         throw new IllegalArgumentException("Commission rate must > 0.0 and < 1.0");
      }
      this.commissionRate = commissionRate;
   }

   @Override
   public double earnings(){
      return getGrossSales() * getCommissionRate();
   }

   @Override
   public String toString(){
      return String.format("%nCommission employee %s%n%s: $%,.2f%n%s: %,.2f", super.toString(),
         "Gross sales", getGrossSales(), "Commission rate", getCommissionRate());
   }
}
