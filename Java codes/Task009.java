// check the greater of 2 numbers

import java.util.*;

public class Task009 {
    public static void main(String[] args) {
        checkGreater(12,10);
    }
    
    static void checkGreater(int num1, int num2){
        if (num1> num2){
            System.out.println("num1 is greater");
        } else{
            System.out.println("num2 is greater");
        }
    }
}


// output : num1 is greater