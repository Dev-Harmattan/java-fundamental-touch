public class GenericMethodTest {
   public static void main(String[] args){
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {4, 5, 5, 6, 2, 6, 9, 10, 7, 3};
      Double[] doubleArray = {1.2, 4.5, 10.3, 7.3, 5.6, 8.9, 8.5};
      Character[] characterArray = {'A', 'E', 'T', 'Y', 'F', 'O', 'D'};

      System.out.printf("Array integerArray contains: ");
      printArray(integerArray); // pass an Integer array
      System.out.printf("Array doubleArray contains: ");
      printArray(doubleArray); // pass a Double array
      System.out.printf("Array characterArray contains: ");
      printArray(characterArray); // pass a Character array
   }

   // generic method printArray
   public static <T> void printArray(T[] inputArray){
      for(T element: inputArray){
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
}
