package looping;
import java.util.Scanner;
class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10];

        while (n != 0) {
            freq[n % 10]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
    }
}
