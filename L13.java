package looping;
import java.util.Scanner;

public class L13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);

        if (sqrt * sqrt == n)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
    }
}