import java.util.Scanner;
public class Q32   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        
        double surfaceArea = 6 * Math.pow(side, 2);
        double volume = Math.pow(side, 3);
        double perimeter = 12 * side;
        
        System.out.println("Surface Area of the cube: " + surfaceArea);
        System.out.println("Volume of the cube: " + volume);
        System.out.println("Perimeter of the cube: " + perimeter);
    }

}
