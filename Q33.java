import java.util.Scanner;
public class Q33   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();
        
        double surfaceArea = 2 * (length * width + width * height + height * length);
        double volume = length * width * height;
        
        System.out.println("Surface Area of the cuboid: " + surfaceArea);
        System.out.println("Volume of the cuboid: " + volume);
    }

}
