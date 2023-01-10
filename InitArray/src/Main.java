import java.security.SecureRandom;

public class Main {
   public static void main(String[] args) {
      if(args.length > 3 || args.length < 3){
         System.out.println("Please supply argument in this format: array length, initial value, increment");
         return;
      }
      int length = Integer.parseInt(args[0]);
      int initialValue = Integer.parseInt(args[1]);
      int increment = Integer.parseInt(args[2]);


      int[] array = new int[length];
      for(int i = 0; i < array.length; i++){
         array[i] = initialValue + increment * i;
      }

      System.out.printf("%-10s%-5s%n", "Index", "Value");
      printValue(array);

   }

   public static void printValue(int[] array){
      for(int index = 0; index < array.length; index++){
         System.out.printf("%-10d%5d%n", index, array[index]);
      }
   }
}