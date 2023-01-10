public class EmployeeTest {
   public static void main(String[] args) {
      Date birth = new Date(2, 22, 1992);
      Date hire = new Date(8, 9, 2020);
      Employee employee = new Employee("Sodiq", "Ganiyu", birth, hire);

      System.out.println(employee);
   }
}