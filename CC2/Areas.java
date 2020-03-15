package areas;
import java.util.Scanner;

public class Areas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the Circle: ");
        double radius = input.nextDouble();
        double AreaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The Area of the Circle is " + AreaOfCircle);
        
        System.out.print("Enter the side of the Square: ");
        double side = input.nextDouble();
        double AreaOfSquare = Math.pow(side, 2);
        System.out.println("The Area of the Square is " + AreaOfSquare);
        
        System.out.print("Enter the base of the Triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double height = input.nextDouble();
        double AreaOfTriangle = (0.5 * base)* height;
        System.out.println("The Area of the Triangle is " + AreaOfTriangle);
        
    }
    
}
