import java.util.Scanner;
public class Q39   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed (in km/h): ");
        double speed = scanner.nextDouble();

        System.out.print("Enter time (in hours): ");
        double time = scanner.nextDouble();

        double distance = speed * time;
        System.out.println("Distance travelled: " + distance + " km");

        
    }

}
