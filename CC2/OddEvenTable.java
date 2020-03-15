
package arrays;
//import java.util.List;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
 
        int[] numbers = {3,9,15,20,65,23,18,4,2,14,21,90,80,20,27,68, 22, 24, 48, 48, 58};
        int[] odd = new int[numbers.length];
        int[] even = new int[numbers.length];
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            
            if(numbers[i] % 2 == 0) {
                even[evenCount] = numbers[i]; 
                evenCount++;
                
            } else {
                odd[oddCount] = numbers[i];
                oddCount++;
            }
                      
        }
        
        int large;
        if (oddCount > evenCount) {
            large = oddCount;
        } else {
            large = evenCount;
        }
        
        String tempOdd = "", tempEven = "";
        
        System.out.println("ODD \t EVEN");
        
        for (int i = 0; i < large ; i++) {        
            
            if (odd[i] == 0) {
                tempOdd = "";
            } else {
                tempOdd = tempOdd.valueOf(odd[i]);
            }
            
            if (even[i] == 0) {
                tempEven = "";
            } else {
                tempEven = tempEven.valueOf(even[i]);
            }
                    
            System.out.println(tempOdd+"\t"+tempEven);
        }
        
     
        
        
        
        
        
        
      

        
    }
    
}
