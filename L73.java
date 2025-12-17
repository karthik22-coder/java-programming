package looping;
import java.util.Scanner;
class L73 {
    static int sumDigits(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int s = i;
            while (s > 9) s = sumDigits(s);
            if (s == 1) System.out.print(i + " ");
        }
    }
}
