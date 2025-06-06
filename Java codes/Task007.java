// Task007: Write a program to take input from the user and display it to the user

import java.util.*;

public class Task007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login id");
        String input = scanner.nextLine();
        System.out.println("Enter your password");
        int num = scanner.nextInt();
        userInput(input,num);
        
    }
    
     static void userInput(String input, int num){
        System.out.println("Hi.. Your login id is " + input + " and password is : ********");
    }
}

/*

output: 

Enter your login id
saikumlo
Enter your password
12345678
Hi.. Your login id is saikumlo and password is : ********

*/