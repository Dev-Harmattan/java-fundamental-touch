import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest {
   // sort array using insertion sort
   public static void insertSort(int[] data){
      for(int next = 1; next < data.length; next++){
         // index 4 data of index 4 = ?
         int insert = data[next]; // value to insert
         int moveItem = next; // location to place element

         // search for place to put current element 4
         while(moveItem > 0 && data[moveItem - 1] > insert){
            data[moveItem] = data[moveItem - 1];
            moveItem--;
         }
         data[moveItem] = insert;
      }
   }

   public static void main(String[] args){
      SecureRandom random = new SecureRandom();
      int[] data = random.ints(10, 10, 91).toArray();
      insertSort(data); // sort array
      System.out.printf("%nSorted array: %s%n", Arrays.toString(data));

   }
}
