import java.util.Scanner;
public class Q40   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double meters = kilometers * 1000;
        System.out.println("Distance in meters: " + meters);
    }

}
