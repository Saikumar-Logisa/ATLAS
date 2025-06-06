// Display numbers from 10 to 1 .. skip 7 and 5.

import java.util.Scanner;

public class Task013 {
    public static void main(String[] args) {
        int num = 10;
        
        while (num >0){
            if (num == 5 || num == 7){
                num--;
                continue;
            }
            else System.out.println(num);
            num--;
        }
    }
}

/*
output:

10
9
8
6
4
3
2
1

*/