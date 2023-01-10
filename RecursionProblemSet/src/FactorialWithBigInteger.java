import java.math.BigInteger;

public class FactorialWithBigInteger {

   public static BigInteger factorial(BigInteger n){
      if(n.compareTo(BigInteger.ONE) <= 0) return BigInteger.ONE;
      return n.multiply(factorial(n.subtract(BigInteger.ONE)));
   }

   public static void main(String[] args){
      // calculate the factorials of 0 through 50
      for(int counter = 0; counter <= 50; counter++){
         System.out.printf("%d! = %d%n", counter,
            factorial(BigInteger.valueOf(counter)));
      }
   }
}
