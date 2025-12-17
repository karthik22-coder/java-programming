package looping;
import java.util.Scanner;
class L46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0, place = 1;

        while (n != 0) {
            int d = n % 10;
            if (d != 0) {
                result += d * place;
                place *= 10;
            }
            n /= 10;
        }
        System.out.println(result);
    }
}
