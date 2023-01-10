import java.util.NoSuchElementException;

public class StackTest {
   public static void main(String[] args) {
      Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
      Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      // Create a Stack<Double> and a Stack<Integer>
      Stack<Double> doubleStack = new Stack<>(5);
      Stack<Integer> integerStack = new Stack<>();

      // push elements of doubleElements onto doubleStack
      testPush(doubleStack, doubleElements);
      testPop(doubleStack); // pop from doubleStack

      //push elements of integerElements onto integerStack
      testPush(integerStack, integerElements);
      testPop(integerStack); // pop from integerStack
   }

   // test push method with double stack
   private static <E> void testPush(Stack<E> stack, E[] values){
      System.out.printf("%nPushing elements onto Stack%n");
      for(E value: values){
         System.out.printf("%s ", value);
         stack.push(value);
      }
   }

   // test pop method
   private static <E> void testPop(Stack<E> stack){
      // pop elements from stack
      try{
         System.out.printf("%nPopping elements from Stack%n");
         E popValue; // store element removed from stack

         // remove all elements from Stack
         while(true){
            popValue = stack.pop();
            System.out.printf("%s ", popValue);
         }
      }catch (NoSuchElementException e){
         System.err.println();
         e.printStackTrace();
      }
   }
}
