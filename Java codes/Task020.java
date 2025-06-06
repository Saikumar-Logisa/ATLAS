// Create an Array and print it

public class Task020 {
    public static void main(String[] args) {
        char[] name = { 'S', 'a', 'i', 'k', 'u', 'm','a','r' };
        System.out.println(name); 
        
        int n = name.length;
        
        System.out.println("There are " + n + " letters in my name.");
        System.out.print("Letters in my name: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + " ");
        }
    }
}

/*
output:

Saikumar
There are 8 letters in my name.
Letters in my name: S a i k u m a r 

*/