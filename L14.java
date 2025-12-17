package looping;
import java.util.Scanner;

 public class L14{
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n != 0) {
            sum += factorial(n % 10);
            n /= 10;
        }

        if (temp == sum)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
}
