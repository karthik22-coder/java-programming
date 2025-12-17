package looping;
import java.util.Scanner;
class L58{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += sc.nextInt();

        System.out.println(sum);
    }
}
