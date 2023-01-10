public class GreatestCommonDivisor {
   public static void main(String[] args){
      System.out.println(gcd(21, 8));
   }

   public static int gcd(int x, int y){
      if(y == 0)  return x;
      return gcd(y, x % y);
   }
}
