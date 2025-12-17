package looping;
import java.util.Scanner;
class L63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), sum = 0, count = 0;
        while (count < N) {
            int n = sc.nextInt();
            if (n > 0) {
                sum += n;
                count++;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
