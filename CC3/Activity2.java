package activity.pkg2;
import java.util.Scanner;
public class Activity2 {

    public static void main(String[] args) {
    
        int size = getSize();
        int[] data = getData(size);
        
        double resultMean = getMean(size, data);
        System.out.println("Mean: " + resultMean);
        
        double resultMode = getMode(data);
        System.out.println("Mode: " + resultMode);
    }
    
    static int getSize(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
       int size= sc.nextInt();
       return size;
    }
    
    static int[] getData(int size){
        Scanner sc = new Scanner(System.in);
        int[] data =new int[size];
        for (int i = 0; i < data.length; i++){
           System.out.print("Enter an Element: "); 
           int element = sc.nextInt();
           data[i] = element;
        }
        
        return data;
            
    }
    
    static double getMean(int n, int[] data){
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }
        
       return sum / n;

    }
    static int getMode(int data[]){
        
        int maxVal = 0, maxCount = 0;
 
        for (int i = 0; i < data.length; i++) {
            
            int count = 0;
            
            for (int j = 0; j < data.length; j++) {
                
                if (data[j] == data[i]) {
                    count++;
                }
                
            }
            
            if (count > maxCount) {
                
                maxCount = count;
                maxVal = data[i];
                
            }
            
        }
        
        return maxVal;
       

    }
}
            
        
    

