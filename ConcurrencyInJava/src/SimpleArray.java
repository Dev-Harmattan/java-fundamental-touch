// Class that manages an integer array to be shared by multiple threads.
import java.util.Arrays;
import java.security.SecureRandom;

public class SimpleArray {
   private static final SecureRandom generator = new SecureRandom();
   private final int[] array; // the shared integer array
   private int writeIndex = 0; // shared index of next element to write

   public SimpleArray(int size){
      array = new int[size];
   }

   public synchronized void add(int value){
      int position = writeIndex; // store the write index

      try{
         // put thread to sleep for 0-499 milliseconds
         // in real applications, you shouldn't sleep while holding a lock
         Thread.sleep(generator.nextInt(500)); // for demo only
      }catch (InterruptedException e){
         Thread.currentThread().interrupt(); // re-interrupt the thread
      }

      // put value in the appropriate element
      array[position] = value;
      System.out.printf("%s wrote %2d to element %d.%n",
         Thread.currentThread().getName(), value, position);

      ++writeIndex;
      System.out.printf("Next write index: %d%n", writeIndex);
   }

   @Override
   public String toString(){
      return Arrays.toString(array);
   }


}
