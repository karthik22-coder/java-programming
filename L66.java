package looping;
import java.util.Scanner;
class L66{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int t = i, sum = 0;
            while (t > 0) {
                int d = t % 10;
                sum += d * d * d;
                t /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
