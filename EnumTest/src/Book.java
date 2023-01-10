public enum Book {
   HTTP("Hypertex transfer protocol", "2000"),
      JAVA("Java how to program", "2012"),
           CJ("Common Journlist", "2019"),
         VBHTP("Visual basic how to program", "2020");

      private String title;
      private String copyright;

      Book(String title, String copyright){
         this.title = title;
         this.copyright = copyright;
      }

      public String getTitle(){
         return this.title;
      }

      public String getCopyright(){
         return this.copyright;
      }


}
