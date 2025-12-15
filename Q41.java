import java.util.Scanner;
public class Q41   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size in bytes: ");
        double bytes = scanner.nextDouble();

        double bits = bytes * 8;
        System.out.println("Size in bits: " + bits);

        
    }

}
