// Write a program to check greater of 3 numbers 

import java.util.*;

public class Task010 {
    public static void main(String[] args) {
        checkGreater(12,10,18);
    }
    
    static void checkGreater(int num1, int num2,int num3){
        if (num1> num2 && num1 > num3){
            System.out.println("num1 is greater");
        } else if (num2> num1 && num2 > num3){
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }
    }
}

// output : num3 is greater
