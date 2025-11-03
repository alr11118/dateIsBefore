public class something{
     // Method to see how many days the month has
     public static int monthHasHowManyDays(int m){
      if (m==2){
         return (28);
      }
      else if (m<=7){
         if (m%2 == 1){
            return(31);
         }
         else{
            return 30;
         }
      }
      else{
         if (m%2 == 0){
            return(31);
         }
         else{
            return 30;
         }
      }
     }
     
     //Method that turns m integer to String months.
     public static String monthToString(int m){
      String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      return (months[m-1]);
     }
     
     // Format neeeded: June 3 comes before Sep 20
     // The method that checks what comes before
     public static String dateIsBefore(int m1, int d1, int m2, int d2){
      if (m1 > 12 || m2 > 12 || d1 > monthHasHowManyDays(m1) || d2 > monthHasHowManyDays(m2)){
         return("Invalid month or day");
      }
      else if (m1 < m2){
         return(monthToString(m1) + " " + d1 + " comes before " + monthToString(m2) + " " + d2);
      }
      else if (m1 == m2 && d1 < d2){
         return(monthToString(m1) + " " + d1 + " comes before " + monthToString(m2) + " " + d2);
      }
      else{
         return(monthToString(m1) + " " + d1 + " does not come before " + monthToString(m2) + " " + d2);
      }
   }
   
   public static void main(String[] args){
      // Test scenarios
      System.out.println(dateIsBefore(6, 3, 9, 20));
      System.out.println(dateIsBefore(10, 1, 2, 5));
      System.out.println(dateIsBefore(8, 15, 8, 15));
      System.out.println(dateIsBefore(8, 15, 8, 16));
      System.out.println(dateIsBefore(40, 150, 89, 165));
      System.out.println(dateIsBefore(6, 31, 9, 20));
      }
}