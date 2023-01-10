public class Date {

      private int day;
      private  int month;
      private int year;

      private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31};

      public Date(int month, int day, int year){
         if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Month (" + month + ") must be 1-12.");
         }

         if(day <= 0 || (day > daysPerMonth[month]) && !(month == 2 && day == 29)){
            throw new IllegalArgumentException("Day ("+ day + ") is out of range for specified day and month.");
         }

         if((month == 2 && day == 29) && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("Day ("+ day + ") is out of range for specified day and month.");
         }

         this.month = month;
         this.day = day;
         this.year = year;

         System.out.printf("Data object constructor for date %s%n", this);
      }

      public String toString(){
         return String.format("%d/%d/%d%n", month, day, year);
      }


}
