// Write a Program to Swap Two Numbers

public class Task004 {
    public static void main(String[] args) {
       swap(2,5);
    }
    
    public static void swap(int a, int b){
        System.out.println("Before swapping : a ->" + a +  " b -> " + b);
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping : a ->" + a + " b -> " + b);
    }
}

/*
ouput :

Before swapping : a ->2 b -> 5
After swapping : a ->5 b -> 2

*/