import java.util.*;

public class ATM {
    private double balance;
    private Scanner scanner;

    public ATM(){
        balance = 1000.0;
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("ATM Menu");
        System.out.println();
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkBalance(){
        System.out.println("Your current balance is INR " + balance);
    }

    public void deposit(){
        System.out.println("Enter the amount to be deposited ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("INR " + amount + " has been deposited");
            System.out.println("Your updated balance is INR " + balance);
        }
        else {
            System.out.println("Invalid amount, please enter valid amount");
        }
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("INR " + amount + " has been withdrawn");
            System.out.println("Your updated balance is INR " + balance);
        } else if (amount > balance){
            System.out.println("Insufficient funds!");
        } else{
            System.out.println("Enter valid amount");
        }
    }

    public static void main(String[] args){
        ATM atm = new ATM();
        
        while(true){
            atm.displayMenu();
            System.out.println();
            System.out.println("Enter your choice");
            int choice = atm.scanner.nextInt();
            
            switch(choice){
                case 1: atm.checkBalance(); break;
                case 2: atm.deposit(); break;
                case 3: atm.withdraw(); break;
                case 4: System.out.println("Thank you for using ATM. Visit again!"); return;
                default: System.out.println("Invalid choice, please choose between 1 to 4");
            }
        }    
    }
}