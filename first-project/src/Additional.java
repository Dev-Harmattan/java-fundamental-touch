//implicitly import
import java.util.Scanner;


public class Additional {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int firstInput, secondInput, sum;

      System.out.print("Enter first number: ");
      firstInput = input.nextInt();
      System.out.print("Enter the second number: ");
      secondInput = input.nextInt();
      sum = firstInput + secondInput;

      System.out.printf("The sum of the input is: %s: %d%n", sum);

   }
}
