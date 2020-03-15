
package pkg2d.array;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        String[][] array2d;
        int row, column; 
        String element;
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number of rows: ");
       
        row = input.nextInt();
        
        array2d = new String[row][];
       
        for (int i = 0; i < row; i++) {
            System.out.print("Enter the number of columns for row " + i + ": ");
            column = input.nextInt(); 

            array2d[i] = new String[column];
            
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element inside row " + i + " in column " + j + ": ");
                element = input.next();
                
                array2d[i][j] = element;

            }
            
        }
        
        System.out.println("\n\nArray Table\n\n");
        
        
        
        for (int i = 0; i < array2d.length; i++) {
            
            System.out.print(i + "\t");
            
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]+"\t");
            }
            
            System.out.println("");
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
