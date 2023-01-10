// PrintTask class sleeps for a random time from 0 to 5 seconds
import java.security.SecureRandom;
public class PrintTask implements Runnable {
   private static final SecureRandom generate = new SecureRandom();
   private final int sleepTime;
   private final String taskName;

   // constructor
   public PrintTask(String taskName){
      this.taskName = taskName;
      // pick random sleep time between 0 and 5 seconds
      sleepTime = generate.nextInt(5000); // milliseconds
   }

   // method run contains the code that a thread will execute
   @Override
   public void run(){
      try{
         System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
         Thread.sleep(sleepTime);
      }catch(InterruptedException e){
         e.printStackTrace();
      }

      // print task name
      System.out.printf("%s done sleeping%n", taskName);
   }
}
