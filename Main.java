public class Main{
     //Method that turns m integer to String months.
     public String monthToString(int m){
      String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      return (months[m-1]);
     }
     // Format neeeded: June 3 comes before Sep 20
     // The method that checks what comes before
     public String main(int m1, int d1, int m2, int d2){
      if (m1 < m2){
         return(monthToString(m1) + " " + d2 + " comes before " + monthToString(m2) + " " + d2);
      }
      else if (m1 == m2 && d1 < d2){
         return(monthToString(m1) + " " + d2 + " comes before " + monthToString(m2) + " " + d2);
      }
      else{
         return(monthToString(m1) + " " + d2 + " does not come before " + monthToString(m2) + " " + d2);
      }
   }
   public static void main(String[] args){
      // Create an object to call the methods
      Main date = new Main();
      System.out.println(date.main(6, 3, 9, 20));
      System.out.println(date.main(10, 1, 2, 5));
      System.out.println(date.main(8, 15, 8, 15));
      System.out.println(date.main(8, 15, 8, 16));
      }
}