import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
   public static void main(String[] args){
      String[] colors = {"yellow", "green", "blue", "violet", "silver"};
      List<String> list1 = new LinkedList<>();

      for(String color: colors){
         list1.add(color);
      }

      String[] colors2 = {"gold", "white", "brown", "blue", "grey", "silver"};
      List<String> list2 = new LinkedList<>();

      for(String color: colors2){
         list2.add(color);
      }

      list1.addAll(list2);
      list2 = null;
      printList(list1);
      
      convertToUppercase(list1);
      printList(list1);
      
      System.out.printf("%nDelete element from 4 to 6....");
      removeItems(list1, 4, 7);
      printList(list1);
      printReverseList(list1);
   }

   public static void printList(List<String> list){
      System.out.printf("%nList:%n");
      for(String color: list){
         System.out.printf("%s ", color);
      }
      System.out.println();
   }

   public static void convertToUppercase(List<String> list){
      ListIterator<String> iterator = list.listIterator();
      while(iterator.hasNext()){
         String color = iterator.next();
         iterator.set(color.toUpperCase());
      }
   }

   public static void removeItems(List<String> list, int start, int end){
      list.subList(start, end).clear();
   }

   public static void printReverseList(List<String> list){
      ListIterator<String> iterator = list.listIterator(list.size());
      System.out.printf("%nReversed list:%n");
      while(iterator.hasPrevious()){
         System.out.printf("%s ", iterator.previous());
      }

   }
}
