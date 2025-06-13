// Multiple Catch blocks; see how the code is flowing

public class Task5_Day9 {
   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         int b = 10;
         int c = 1/b;
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArithmeticException e) {
         System.out.println("ArithmeticException thrown :" + e);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException thrown :" + e);
      } catch (Exception e) {
          System.out.println("Exception thrown :" + e.getMessage());
      }
      System.out.println("Out of the block");
   }
}


/*

output:

ArrayIndexOutOfBoundsException thrown :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
Out of the block

*/