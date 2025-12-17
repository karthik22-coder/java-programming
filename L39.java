package looping;
import java.util.Scanner;
class L39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean desc = true;

        while (n > 9) {
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
            if (d1 > d2) {
                desc = false;
                break;
            }
            n /= 10;
        }
        System.out.println(desc ? "Descending" : "Not Descending");
    }
}
