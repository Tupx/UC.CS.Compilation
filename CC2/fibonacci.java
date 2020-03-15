
package myfib;
import java.util.Scanner;


// Final Activity 1
public class MyFib {
    
    public static void main(String[] args) {
        display();
    }
    
    static int fib(int x){   
        if (x <= 1) {
            return x;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }
    
    static void display(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the the Fibonacci Number: ");
        int n = input.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.print("fib(" + i +") \t" );
        }
        
        System.out.println("");
        
        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print(fib(j) + "\t");
            }
            
            System.out.println("");
            
        }
 
    }
    
    
    
}
