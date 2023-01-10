import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
   public static int binarySearch(int[] data, int searchKey){
      int low = 0; // high end of the search area
      int high = data.length - 1; // middle element
      int middle = (low + high + 1) / 2; // return value; -1 if not found

      int location = -1;

      do { // loop to search for element
         // print remaining elements of array
         if(data[middle] == searchKey){
            location = middle;
         } else if(data[middle] < searchKey){
            low = middle + 1;
         } else {
            high = middle - 1;
         }
         middle = (low + high + 1) / 2;
      }while((low <= high) && (location == -1));

      return location;
   }

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      SecureRandom random = new SecureRandom();
      int[] data = random.ints(15, 10, 91).sorted().toArray();

      System.out.printf("%s%n%n", Arrays.toString(data)); // display array
      System.out.print("Please enter an integer value (-1 to quit): ");
      int searchInt = input.nextInt();

      while(searchInt != -1){
         int searchResult = binarySearch(data, searchInt);

         if(searchResult == -1){
            System.out.printf("%d was not found%n%n", searchResult);
         } else {
            System.out.printf("%d was found in position %d%n%n",
               searchInt, searchResult);
         }
         System.out.print("Please enter an integer value (-1 to quit): ");
         searchInt = input.nextInt();
      }



   }
}
