package looping;
import java.util.Scanner;
class L64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0) c++;
            if (c == 2) System.out.print(i + " ");
        }
    }
}
