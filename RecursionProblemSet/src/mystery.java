public class mystery {
   public static void main(String[] args){
      System.out.printf("Mystery of %d with %d is: %d%n", 2, 8, mystery(2, 8));
   }

   public static int mystery(int a, int b) {
      if (b == 1) {
         return a;
      }
      else {
         return a + mystery(a, b - 1);
//                2 + mystery(2, 7);
//                     2 + mystery(2, 6);
//                           2 + mystery(2, 5);
//                                 2 + mystery(2, 4);
//                                       2 + mystery(2, 3);
//                                             2 + mystery(2, 2);
//                                                   2 + mystery(2, 1);
//                                                         2
      }
    }
}
