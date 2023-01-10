public class Account {
   private String name;
   public double balance;

   public Account(String name, double balance){
      this.name = name;

      if(balance > 0.0){
         this.balance = balance;
      }
   }

   public double getBalance(){
      return balance;
   }

   public void deposit(double amount){
      if(amount > 0){
         this.balance = this.balance + amount;
      }
   }

   //set name public method
   public void setName(String name){
      this.name = name;
   }

   // get name public method
   public String getName(){
      return name;
   }
}
