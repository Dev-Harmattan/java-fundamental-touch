import java.util.stream.IntStream;
public class Main {
   public static void main(String[] args) {
      System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1, 10).sum());
      System.out.printf("Sum of the even ints from 2 through 20 is: %d%n", IntStream.rangeClosed(1, 10).map(val -> val * 2).sum());

      //

      
   }
}