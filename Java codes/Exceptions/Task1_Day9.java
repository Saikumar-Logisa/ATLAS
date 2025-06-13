// Try accessing 10th element

public class Task1_Day9 {
  public static void main(String[] args) {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
  }
}

/*
output:

ERROR!
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
	at Task1_Day9.main(Main.java:4)
	
*/