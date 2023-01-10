import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperation {
   public static void main(String[] args){
      int[] values = {3, 4, 5, 8, 7, 10, 2, 6, 8, 1};

      // display original values
      System.out.print("Original values: ");
      System.out.println(IntStream.of(values)
         .mapToObj(String::valueOf)
         .collect(Collectors.joining(" ")));

      // count, min, max, sum and average of the values
      System.out.printf("%nCount: %d%n", IntStream.of(values).count());
      System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
      System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
      System.out.printf("Sum: %d%n", IntStream.of(values).sum());
      System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());


      //Using summary statistic class
      System.out.printf("Using summary statistic: %s%n", IntStream.of(values).summaryStatistics());

      // sum of values with reduce method
      System.out.printf("%nSum via reduce method: %d%n",
         IntStream.of(values).reduce(0, (x, y) -> x + 7));

      // product of values with reduce method
      System.out.printf("Product via reduce method: %d%n",
         IntStream.of(values).reduce(1, (x, y) -> x * y));

      // displaying the elements in sorted order
      System.out.printf("Values displayed in sorted order: %s%n",
         IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));

      //
   }
}
