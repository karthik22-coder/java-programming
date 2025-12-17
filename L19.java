package looping;
import java.util.Scanner;

public class L19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;

        while (temp != 0) {
            if (temp % 10 != square % 10) {
                System.out.println("Not an Automorphic number");
                return;
            }
            temp /= 10;
            square /= 10;
        }
        System.out.println("Automorphic number");
    }
}
