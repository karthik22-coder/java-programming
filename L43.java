package looping;
import java.util.Scanner;
class L43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;

        while (n != 0) {
            int d = n % 10;
            if (d < min)
                min = d;
            n /= 10;
        }
        System.out.println(min);
    }
}
