package looping;
import java.util.Scanner;
class L38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean asc = true;

        while (n > 9) {
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
            if (d1 < d2) {
                asc = false;
                break;
            }
            n /= 10;
        }
        System.out.println(asc ? "Ascending" : "Not Ascending");
    }
}
