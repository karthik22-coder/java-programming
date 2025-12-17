package looping;
import java.util.Scanner;

public class L17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        if (temp % sum == 0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");
    }
}
