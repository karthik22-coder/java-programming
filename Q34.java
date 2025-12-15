import java.util.Scanner;
public class Q34   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        
        System.out.println("Surface Area of the sphere: " + surfaceArea);
        System.out.println("Volume of the sphere: " + volume);
    }

}
