// Add finally block along with try catch

public class Task3_Day9 {
  public static void main(String[] args) {
      try{
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
      } catch(Exception e){
          System.out.println("Incorrect index, please access element with in Array range");
      }finally{
          System.out.println("Try again!");
      }
  }
}

/*
output:

Incorrect index, please access element with in Array range
Try again!

*/