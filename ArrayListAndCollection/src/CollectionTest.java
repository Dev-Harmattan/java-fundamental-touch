import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

   public static void main(String[] args) {
      String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
      List<String> lists = new ArrayList<String>();

      //add color to the list
      for(String color: colors){
         lists.add(color);
      }

      String[] removeColors = {"RED", "WHITE", "BLUE"};
      List<String> removeLists = new ArrayList<String>();

      for(String removeColor: removeColors){
         removeLists.add(removeColor);
      }

      System.out.println("Array List: ");

      for(int count = 0; count < lists.size(); count++){
         System.out.printf("%s ", lists.get(count));
      }

      removeColors(lists, removeLists);
      System.out.printf("%n%nArrayList after calling remove list method%n");

      for(String color: lists){
         System.out.printf("%s ", color);
      }
   }

   public static void removeColors(Collection<String> collection1, Collection<String> collection2){
      Iterator<String> iterator = collection1.iterator();
      while(iterator.hasNext()){
         if(collection2.contains(iterator.next())){
            iterator.remove();
         }
      }
   }
}