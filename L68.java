package looping;
import java.util.Scanner;
class L68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++)
                if (i % j == 0) sum += j;
            if (sum == i) System.out.print(i + " ");
        }
    }
}
