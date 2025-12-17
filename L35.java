package looping;
import java.util.Scanner;
class L35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        while (n >= 10)
            n /= 10;
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
