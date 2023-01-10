import java.math.BigInteger;
import java.util.stream.Stream;

public class FactorialWithLamda {
   public static void main(String[] args){
      BigInteger number = BigInteger.valueOf(21);
      System.out.printf("%d! = %d%n", number, factorial(number));
   }
   public static BigInteger factorial(BigInteger n){
      return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).limit(n.longValue()).reduce(BigInteger.ONE, BigInteger::multiply);
   }
}
