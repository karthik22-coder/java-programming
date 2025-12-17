package looping;
import java.util.Scanner;

public class L31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("Binary = " + binary);
    }
}
