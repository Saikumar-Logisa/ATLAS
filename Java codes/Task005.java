// Create a code in which you have 4 methods add, subtract, multiply and divide (return type int) with a main method to call all the other methods 

public class Task005 {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers is :" + add(2,3));
        System.out.println("Sum of two numbers is :" + substract(5,2));
        System.out.println("Sum of two numbers is :" + multiple(3,4));
        System.out.println("Sum of two numbers is :" + divide(10,2));
       
    }
    
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }
    
     public static int substract(int a, int b){
        int result = a-b;
        return result;
    }
    
     public static int multiple(int a, int b){
        int result = a*b;
        return result;
    }
    
     public static int divide(int a, int b){
        int result = a/b;
        return result;
    }
}


/*
output : 

Sum of two numbers is :5
Sum of two numbers is :3
Sum of two numbers is :12
Sum of two numbers is :5

*/