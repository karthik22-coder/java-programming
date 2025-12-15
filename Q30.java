import java.util.Scanner;
public class Q30  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    
}
