package looping;
import java.util.Scanner;

public class L20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println("Magic number");
        else
            System.out.println("Not a magic number");
    }
}
