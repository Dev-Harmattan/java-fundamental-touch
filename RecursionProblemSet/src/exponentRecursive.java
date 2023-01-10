public class exponentRecursive {
   public static int exponent(int number, int power){
      if(power == 1) return number;
      return number * exponent(number, power - 1);
   }

   public static void main(String[] args){
      System.out.printf("%d^%d = %d", 3, 4, exponent(3, 4));
   }
}
