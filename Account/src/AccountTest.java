import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Account account1 = new Account("Account record", 90);
      Account account2 = new Account("Business Record", 79);
      System.out.printf("%s initial Balance: %.2f%n%n", account1.getName(), account1.getBalance());
      System.out.printf("%s initial Balance: %.2f%n%n", account2.getName(), account2.getBalance());

      System.out.printf("Enter the amount to deposit for %s:%n", account1.getName());
      double firstAccountAmount = scanner.nextDouble();
      account1.deposit(firstAccountAmount);

      System.out.printf("Enter the amount to deposit for %s:%n", account2.getName());
      double secondAccountAmount = scanner.nextDouble();
      account1.deposit(secondAccountAmount);


      System.out.printf("%s Balance: %.2f%n%n", account1.getName(), account1.getBalance());
      System.out.printf("%s Balance: %.2f%n%n", account2.getName(), account2.getBalance());




   }
}
