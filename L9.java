package looping;
import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;
        System.out.println("LCM = " + lcm);
    }
}
