public class DeckOfCardsTest {
   public  static void main(String[] args){
      DeckOfCards deckOfCards = new DeckOfCards();
      deckOfCards.suffle();

      for(int count = 1; count <= 52; count++){
         System.out.printf("%-19s", deckOfCards.dealCard());

         if(count % 4 == 0){
            System.out.println();
         }
      }
   }
}
