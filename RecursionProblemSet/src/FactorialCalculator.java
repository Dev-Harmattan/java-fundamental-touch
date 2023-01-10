public class FactorialCalculator {
   // recursive method factorial (assumes its parameter is >= 0)
   public static long factorial(long n){
      if(n <= 1) return 1;
      return n * factorial(n - 1);
   }

   public static void main(String[] args){
      // calculate the factorials of 0 through 21
      for(int counter = 0; counter <= 20; counter++){
         System.out.printf("%d! = %d%n", counter, factorial(counter));
      }
   }
}


