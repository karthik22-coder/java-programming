import java.util.Scanner;
public class Q35   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        System.out.println("Surface Area of the cylinder: " + surfaceArea);
        System.out.println("Volume of the cylinder: " + volume);
    }

}
