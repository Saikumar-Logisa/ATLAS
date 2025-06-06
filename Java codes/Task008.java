// Task008: Write a program to create a class named Customer, Call the customer class in Task008 class using an object

import java.util.*;

public class Task008 {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.accept();
        cust.display();
        
    }
}

public class Customer {
    
    static void accept(){
        System.out.println("accept customer called!");
    }
    
    static void display(){
        System.out.println("display customer called!");
    }
}

/* output: 
accept customer called!
display customer called!

*/
