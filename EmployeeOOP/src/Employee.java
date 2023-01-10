public abstract class Employee {
   private String firstName;
   private String lastName;
   private String socialNumberSecurity;


   public Employee(String firstName, String lastName, String socialNumberSecurity){
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialNumberSecurity = socialNumberSecurity;
   }

   public String getFirstName(){
      return firstName;
   }

   public void setFirstName(String firstName){
      this.firstName = firstName;
   }

   public String getLastName(){
      return lastName;
   }

   public void setLastName(String lastName){
      this.lastName = lastName;
   }

   public String getSocialNumberSecurity(){
      return socialNumberSecurity;
   }

   public void setSocialNumberSecurity(String socialNumberSecurity){
      this.socialNumberSecurity = socialNumberSecurity;
   }

   @Override
   public String toString(){
      return String.format("%nName: %s %s%n%s: %s", getFirstName(), getLastName(), "Social security number", getSocialNumberSecurity());
   };

   public abstract double earnings();
}
