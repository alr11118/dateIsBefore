public class Main{
     // The method that checks what comes before
     public static boolean dateIsBefore(int m1, int d1, int m2, int d2){
      if (m1 < m2){
         return(true);
      }
      else if (m1 == m2 && d1 < d2){
         return(true);
      }
      else{
         return(false); 
      }
   }
   public static void main(String[] args){
      // Test cases
      System.out.println(dateIsBefore(6, 3, 9, 20));
      System.out.println(dateIsBefore(10, 1, 2, 25));
      System.out.println(dateIsBefore(8, 15, 8, 15));
      System.out.println(dateIsBefore(8, 15, 8, 16));
      }
}