package looping;
import java.util.Scanner;
class L36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean found = false;

        while (n != 0) {
            if (n % 10 == d) {
                found = true;
                break;
            }
            n /= 10;
        }
        System.out.println(found ? "Digit Found" : "Digit Not Found");
    }
}
