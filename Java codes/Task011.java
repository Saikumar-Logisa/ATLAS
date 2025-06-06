// Write a program to check weekdays

import java.util.*;

public class Task011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        dayCheck(day);
    }
    
    static void dayCheck(int day){
        switch(day){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default:
            System.out.println("Invalid input");
            
        }
    }
}

/*
Inp : 3
Output : Tuesday

*/