public class TimeTest {
   public static void main(String[] args) {
      Time1 time = new Time1();

      displayTime("Before setting any time", time);
      time.setTime(16, 45, 50);

      displayTime("After setting time", time);

      try {
         time.setTime(67, 90, 90);
      } catch (IllegalArgumentException e){
         System.out.printf("Exception %s%n%n", e.getMessage());
      }
      displayTime("After throw exception", time);
   }

   public static void displayTime(String header, Time1 t){
      System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
   }
}