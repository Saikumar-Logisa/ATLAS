// check loginid and password validation 

import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String validLoginId = "saikumlo";
        String validPwd = "12345678";

        System.out.print("Enter your login ID: ");
        String loginId = sc.nextLine();
        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        int count = 0;

        while (loginId.equals(validLoginId) && pwd.equals(validPwd)) {
            count++;
            System.out.println("You have logged in for " + count + " times");

            System.out.print("Enter your login ID: ");
            loginId = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();
        }

        System.out.println("Invalid login or password. Exiting..!");
    }
}

/* output:

Enter your login ID: saikumlo
Enter your password: 12345678
You have logged in for 1 times
Enter your login ID: saikumlo
Enter your password: 12345678
You have logged in for 2 times
Enter your login ID: saikumlo
Enter your password: 12345768
Invalid login or password. Exiting..!


*/


// Do while approach

import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String validLoginId = "saikumlo";
        String validPwd = "12345678";

        String loginId;
        String pwd;
        int count = 0;

        do {
            System.out.print("Enter your login ID: ");
            loginId = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginId.equals(validLoginId) && pwd.equals(validPwd)) {
                count++;
                System.out.println("You have logged in for " + count + " times");
            } else {
                System.out.println("Invalid login or password. Exiting...");
            }
        } while (loginId.equals(validLoginId) && pwd.equals(validPwd));
    }
}
