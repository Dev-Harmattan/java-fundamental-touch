public class PayableInterfaceTest {
   public static void main(String[] args){
      Payable[] payableObjects = new Payable[4];

      payableObjects[0] = new Invoice("0389", "tire", 2, 564);
      payableObjects[1] = new Invoice("0394", "Dashboard", 3, 790);
      payableObjects[2] = new SalariedEmployee("Joe", "Frank", "355-903-099", 800);
      payableObjects[3] = new SalariedEmployee("Bliss", "Clinton", "355-900-199", 890);

      System.out.println("Invoice and employee program polymporphically:");

      for(Payable currentPayable: payableObjects){
         System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
            "Payment due", currentPayable.getPaymentAmount());
      }


   }

}
