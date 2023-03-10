import java.math.BigInteger;

public class FibonacciCalculator {
   public static void main(String[] args){
      // displays the fibonacci values from 0-40
      for(int counter = 0; counter <= 40; counter++){
         System.out.printf("Fibonacci of %d is: %d%n", counter,
            fibonacci(BigInteger.valueOf(counter)));
      }
   }

   public static BigInteger fibonacci(BigInteger number){
      if (number.equals(BigInteger.ZERO) ||
                   number.equals(BigInteger.ONE))
              return number;

         return fibonacci(number.subtract(BigInteger.ONE)).add(
                fibonacci(number.subtract(BigInteger.valueOf(2))));
   }
}
