import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
   public static void selectionSort(int[] data){
      // loop over data.length -1 elements
      for(int i = 0; i < data.length - 1; i++){
         int smallest = i;
         for(int j = i + 1; j < data.length; j++){
            if(data[j] < data[smallest]){
               smallest = j;
            }
         }
         swap(data, i, smallest); // swap smallest element into position
      }
   }

   public static void swap(int[] data, int first, int second){
      int temp = data[first];
      data[first] = data[second];
      data[second] = temp;
   }

   public static void main(String[] args){
      SecureRandom random = new SecureRandom();
      int[] data = random.ints(10, 10, 91).toArray();
      selectionSort(data); // sort array
      System.out.printf("%nSorted array: %s%n", Arrays.toString(data));

   }
}
