package looping;
import java.util.Scanner;
class L40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int first = n / (int)Math.pow(10, count - 1);
        int last = n % 10;
        int middle = (n % (int)Math.pow(10, count - 1)) / 10;

        int result = last * (int)Math.pow(10, count - 1) +
                     middle * 10 + first;

        System.out.println(result);
    }
}
