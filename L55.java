package looping;
import java.util.Scanner;
class L55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, i = 1;
        while (count < n) {
            System.out.print(i + " ");
            i += 2;
            count++;
        }
    }
}
