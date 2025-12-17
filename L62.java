package looping;
import java.util.Scanner;
class L62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        while (true) {
            n = sc.nextInt();
            if (n < 0) break;
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}
