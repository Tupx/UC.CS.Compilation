package guessinggame;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the Answer to be Guessed (1 - 1000): ");    
        
        int guessRandom = input.nextInt();
        
        System.out.println("Answer: " + guessRandom);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
   
        System.out.println("Guess a number from 1 to 1000");
        System.out.print("Enter a number: ");
        int userGuess = input.nextInt();
        
        if (guessRandom == userGuess) {
            System.out.println("Correct! The number is " + guessRandom);
            
        } else {
            
            while (guessRandom != userGuess) {
                
            if (guessRandom >= userGuess) {
                System.out.println("Hint: The number is lower");
                
            } else if(guessRandom <= userGuess) {
                System.out.println("Hint: The number is higher");
            }
            
            if (guessRandom % 2 == 0) {
                System.out.println("Hint: The number is even");
            } else {
                System.out.println("Hint: The number is odd");
            }

            System.out.print("Guess the number Again: ");
            userGuess = input.nextInt();
            }
            
        } 
        
    }
    
}
