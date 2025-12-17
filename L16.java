package looping;
import java.util.Scanner;

public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == n)
            System.out.println("Neon number");
        else
            System.out.println("Not a neon number");
    }
}
