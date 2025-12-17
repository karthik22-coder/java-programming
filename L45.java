package looping;
import java.util.Scanner;
class L45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0)
                evenSum += d;
            else
                oddSum += d;
            n /= 10;
        }
        System.out.println(evenSum - oddSum);
    }
}
