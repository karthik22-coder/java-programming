package looping;
import java.util.Scanner;

public class L18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 10 == 7 || n % 7 == 0)
            System.out.println("Buzz number");
        else
            System.out.println("Not a Buzz number");
    }
}
