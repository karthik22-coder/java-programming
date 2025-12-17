package looping;
import java.util.Scanner;
class L74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++)
            if ((i & (i - 1)) == 0)
                System.out.print(i + " ");
    }
}
