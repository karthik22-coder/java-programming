package looping;
import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
