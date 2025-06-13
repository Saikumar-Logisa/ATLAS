// try accessing 2nd element instead of 10

public class Task4_Day9 {
  public static void main(String[] args) {
      try{
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[2]);
      } catch(Exception e){
          System.out.println("Incorrect index, please access element with in Array range");
      }finally{
          System.out.println("Try again!");
      }
  }
}

/*
output:

3
Try again!

*/