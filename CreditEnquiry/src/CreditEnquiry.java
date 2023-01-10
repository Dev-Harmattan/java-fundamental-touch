import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.nio.file.Paths;

public class CreditEnquiry {
   private static final MenuOptions[] choices = MenuOptions.values();
   public static void main(String[] args) {
      MenuOptions requestType = getRequest();
      while(requestType != MenuOptions.END){
         switch(requestType){
            case ZERO_BALANCE:
               System.out.printf("%nAccounts with zero balance%n");
               break;
            case CREDIT_BALANCE:
               System.out.printf("%nAccounts with credit balance%n");
               break;
            case DEBIT_BALANCE:
               System.out.printf("%nAccounts with debit balance%n");
               break;
         }

         readRecords(requestType);
         requestType = getRequest();
      }
   }

   public static MenuOptions getRequest(){
      int request = 4;

      System.out.printf("%nEnter request%n%s%n%s%n%s%n%s",
         "List accounts with zero balances",
         "List accounts with credit balances",
         "List accounts with debit balances",
         "Terminate program"
         );

      try {
         Scanner input = new Scanner(System.in);
         do {
            System.out.printf("%n? ");
            request = input.nextInt();
         } while(request < 1 || request > 4);
      }catch (NoSuchElementException e){
         System.err.println("Invalid input. Terminating...");
      }
      return choices[request - 1];
   }
   public static void readRecords(MenuOptions accountType){
      try(Scanner input = new Scanner(Paths.get("clients.txt")))
      {
         while(input.hasNext()){
            int account = input.nextInt();
            String firstName = input.next();
            String lastName = input.next();
            double amount = input.nextDouble();

            if(shouldDisplay(accountType, amount)){
               System.out.printf("%-10d%-12s%-12s%10.2f", account, firstName, lastName, amount);
            }else{
               input.nextLine();
            }
         }
      }catch (IllegalStateException | NoSuchElementException | IOException e){
         System.err.println("Error while reading file. Terminating..");
         System.exit(1);
      }
   }

   public static boolean shouldDisplay(MenuOptions accountType, double amount){
      if(accountType == MenuOptions.CREDIT_BALANCE && amount < 0){
         return true;
      } else if(accountType == MenuOptions.DEBIT_BALANCE && amount > 0){
         return true;
      } else if(accountType == MenuOptions.ZERO_BALANCE && amount == 0){
         return true;
      }
      return false;
   }

}