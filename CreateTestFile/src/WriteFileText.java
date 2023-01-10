import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;

public class WriteFileText {
   private static Formatter output;

   public static void main(String[] args){
      openFile();
      addRecords();
      closeFile();
   }

   public static void openFile(){
      try{
         output = new Formatter("clients.txt");
      }catch (SecurityException e){
         System.out.println("Write permission denied, Terminating...");
         System.exit(1);
      } catch(FileNotFoundException e){
         System.out.println("Error while opening file, Terminating..");
         System.exit(1);
      }
   }

   public static void addRecords(){
      Scanner input = new Scanner(System.in);
      System.out.printf("%s%n%s%n",
         "Enter account number, first name, last name and balance",
         "Enter end of file indicator to end the input");

      while(input.hasNext()){
         try{
            output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
         }catch (FormatterClosedException e){
            System.err.println("Error write to file, Terminating....");
            break;
         }catch (NoSuchElementException e) {
            System.err.println("Invalid input. Please try again.");
            input.nextLine();
         }
         System.out.print("?");
      }
   }

   public static void closeFile(){
      if(output != null){
         output.close();
      }
   }
}