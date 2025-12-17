package looping;
import java.util.Scanner;
class L57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) even += i;
            else odd += i;
        }
        System.out.println("Even Sum = " + even);
        System.out.println("Odd Sum = " + odd);
    }
}
