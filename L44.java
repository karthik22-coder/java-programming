package looping;
import java.util.Scanner;
class L44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean even = true, odd = true;

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0)
                odd = false;
            else
                even = false;
            n /= 10;
        }

        if (even) System.out.println("All Even");
        else if (odd) System.out.println("All Odd");
        else System.out.println("Mixed");
    }
}
