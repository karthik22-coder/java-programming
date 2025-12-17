package looping;
import java.util.Scanner;
public class L21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 1 && n % 3 == 0) {
            n /= 3;
        }

        if (n == 1)
            System.out.println("Power of 3");
        else
            System.out.println("Not a power of 3");
    }
}
