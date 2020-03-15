
package finalactivity;
import java.util.Scanner;

public class FinalActivity {

    public static void main(String[] args) {
       display();
    }
    
    static int fib(int n){
        
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
        
    }
    
    static int fact(int n){
        
        if (n <= 1 ) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
        
    }
    
    static String userRequest(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Choose Fibonacci / Factorial: ");
        String choice = input.nextLine().toLowerCase();
        
        if (choice.equals("fibonacci") || choice.equals("fib")) {
            
           return "fib";
            
        } else if (choice.equals("factorial") ||  choice.equals("fact")){
            
           return "fact";
            
        } else {
            
            System.out.println("Unknown Input ");
            return userRequest();
        }
            
    }
    
    static int getArraySize(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the data: ");
        int size = input.nextInt();
        return size;
    }
    
    static void display(){
        
        Scanner input = new Scanner(System.in);
        
        String choice = userRequest();
        int size = getArraySize();
        int[] datas = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element: ");
            datas[i] = input.nextInt();
        }
        
        switch(choice){
            
            case "fib":
                
                for (int i = 0; i < datas.length; i++) {
                    System.out.print("fib(" + datas[i] + ")\t");
                }
                
                System.out.println("\nThe fib is:");
               
                for (int i = 0; i < datas.length; i++) {
                    System.out.print(fib(datas[i]) + " \t");
                }             
                
                break;
                
            case "fact":
                
                for (int i = 0; i < datas.length; i++) {
                    System.out.print("fact(" + datas[i] + ")\t");
                }
                
                System.out.println("\nThe fact is:");
                
                for (int i = 0; i < datas.length; i++) {
                    System.out.print(fact(datas[i]) + " \t");
                }
            
                break;
                    
        }
    }
}
