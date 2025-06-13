// Nested Try blocks

public class Task6_Day9 {
   public static void main(String args[]) {
      try {
         int a[] = new int[2];
        System.out.println("Access element :" + a[1]);
         try {
            int b = 0;
            int c = 1/b;
         } catch(Exception e) {
            System.out.println("Exception thrown in inner block: " + e);
         }
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown in outer block: " + e);
      }
      System.out.println("Out of the block");
   }
}


/* Here both inner and outer blocks are working, because : c = 1/b gives ArithmeticException (inner try block); 
Access element three gives ArrayIndexOutOfBoundsException, hence outer catch block executes

*/

/*
output:

Access element :0
Exception thrown in inner block: java.lang.ArithmeticException: / by zero
Exception thrown in outer block: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Out of the block

*/


// Only outer block works here

public class Task6_Day9 {
   public static void main(String args[]) {
      try {
         int a[] = new int[2];
        System.out.println("Access element three :" + a[2]);
         try {
            int b = 0;
            int c = 1/b;
         } catch(Exception e) {
            System.out.println("Exception thrown in inner block: " + e);
         }
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown in outer block: " + e);
      }
      System.out.println("Out of the block");
   }
}

/*

output:

Exception thrown in outer block: java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
Out of the block

*/