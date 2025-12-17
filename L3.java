package looping;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
}
        System.out.println("Number of digits = " + count);
    }
}
