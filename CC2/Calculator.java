
package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Operator: ");
        String operator = input.nextLine();
        
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter secodn number: ");
        int b = input.nextInt();
        
        switch(operator){
            
            case "+":
            case "add":
                int sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;
                
            case "-":
            case "subtract":
                int difference = a - b;
                System.out.println(a + " - " + b + " = " + difference);
                break;
                
            case "*":
            case "multiply":
                int quotient = a * b;
                System.out.println(a + " * " + b + " = " + quotient);
                break;
            
            case "/":
            case "divide":
                double dividend = a / b;
                System.out.println(a  + " / " + b + " = " + dividend);
                break;
                    
            case "%":
            case "modulo":
                double modulo = a % b;
                System.out.println(a + " % " + b + " = " + modulo);
                break;
         
            default:
                System.out.println("Unknow Operator");
                        
        }
        
    }
    
}
