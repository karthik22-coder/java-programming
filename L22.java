package looping;
import java.util.Scanner;

public class L22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= b; i++) {
            result += a;
        }
        System.out.println("Product = " + result);
    }
}
