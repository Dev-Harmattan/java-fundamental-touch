import java.util.EnumSet;

public class EnumTests {
   public static void main(String[] args){
      System.out.println("All books");

      for(Book book: Book.values()){
         System.out.printf("%n%-10s%-45s%s%n", book, book.getTitle(), book.getCopyright());
      }

      System.out.printf("%nDisplay a range of enum constant");
      for(Book book: EnumSet.range(Book.HTTP, Book.CJ)){
         System.out.printf("%n%-10s%-45s%s%n", book, book.getTitle(), book.getCopyright());
      };
   }
}
