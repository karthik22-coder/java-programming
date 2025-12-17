package looping;
import java.util.Scanner;

public class L30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int ones = 0, zeros = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                ones++;
            else if (binary.charAt(i) == '0')
                zeros++;
        }

        System.out.println("Number of 1s = " + ones);
        System.out.println("Number of 0s = " + zeros);
    }
}
