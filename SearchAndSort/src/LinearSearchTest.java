import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {
   public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      SecureRandom random = new SecureRandom();

      int[] data = random.ints(10, 10, 91).toArray();

      System.out.printf("%s%n%n",Arrays.toString(data));

      // get input from user
      System.out.print("Please enter an integer value (-1 to quit): ");
      int position = input.nextInt();

      while(position != -1){
         int searchResult = linearSearch(data, position);

         if(searchResult == -1){
            System.out.printf("%d was not found%n%n", searchResult);
         } else {
            System.out.printf("%d was found in position %d%n%n",
               position, searchResult);
         }
         System.out.print("Please enter an integer value (-1 to quit): ");
         position = input.nextInt();
      }
   }

   public static int linearSearch(int[] data, int searchKey){
      for(int index = 0; index < data.length; index++){
         if(data[index] == searchKey){
            return index;
         }
      }
      return -1;
   }
}