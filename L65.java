package looping;
import java.util.Scanner;
class L65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), count = 0, num = 2;
        while (count < N) {
            int c = 0;
            for (int i = 1; i <= num; i++)
                if (num % i == 0) c++;
            if (c == 2) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
