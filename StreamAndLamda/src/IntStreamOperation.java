import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class IntStreamOperation {
   public static void main(String[] args){
      int[] values = {3, 10,1, 8, 4, 5, 8, 18, 5, 2, 3, 4};
      Integer[] listInt = {4, 5, 5, 8, 2, 4};
      List<Integer> list = new ArrayList<>(Arrays.asList(listInt));
      System.out.print("Original value: ");
      IntStream.of(values).forEach((value) -> System.out.printf("%d ", value));
      System.out.println();

      //count, min, max, average of the values.
      System.out.printf("%nCount: %d%n", IntStream.of(values).count());
      System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
      System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
      System.out.printf("Sum: %d%n", IntStream.of(values).sum());
      System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
      System.out.printf("Reduce value: %d%n", IntStream.of(values).reduce(0, Integer::sum));
      System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
      System.out.println("Print the values meet condition > 4 && < 10");
      IntStream.of(values).filter(value -> value > 4 && value < 10)
         .map(val -> val * 2)
         .sorted().forEach((value) -> System.out.printf("%d ", value));
   }
}
