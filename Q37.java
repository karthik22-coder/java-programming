import java.util.Scanner;
public class Q37  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in minutes: ");
        double minutes = scanner.nextDouble();

        double seconds = minutes * 60;
        System.out.println("Time in seconds: " + seconds);
    }

}
