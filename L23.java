package looping;
import java.util.Scanner;

public class L23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // base
        int m = sc.nextInt(); // power
        int result = 1;

        for (int i = 1; i <= m; i++) {
            result *= n;
        }
        System.out.println("Result = " + result);
    }
}
