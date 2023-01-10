import java.security.SecureRandom;

public class Crap {
   private static final SecureRandom randomNumbers = new SecureRandom();

   //declare a status for the game.
   private enum Status {
      CONTINUE,
      WON,
      LOST
   };

   // constants that represent the common role of the dice.
   private static final int SNAKES_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_ELEVEN = 11;
   private static final int BOX_CARS = 12;

   public static void main(String[] args){
      int myPoint;
      Status gameStatus;

      int sumOfDice = roleDice();

      switch(sumOfDice){
         case SEVEN:
         case YO_ELEVEN:
            gameStatus = Status.WON;
            return;
         case TREY:
         case SNAKES_EYES:
         case BOX_CARS:
            gameStatus = Status.LOST;
            return;
         default:
            gameStatus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("The point is %d%n", myPoint);
            break;
      }

      while(gameStatus == Status.CONTINUE){
         sumOfDice = roleDice();
         if(sumOfDice == myPoint)
            gameStatus = Status.WON;
         else
            if(sumOfDice == SEVEN)
               gameStatus = Status.LOST;
      }

      if(gameStatus == Status.WON){
         System.out.println("Player Won.");
      }else {
         System.out.println("Player Lost.");
      }
   }

   public static int roleDice() {
      int dice1 = 1 + randomNumbers.nextInt(6);
      int dice2 = 1 + randomNumbers.nextInt(6);

      int sum = dice2 + dice2;
      System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
      return sum;
   }
}
