package looping;
import java.util.Scanner;
class L47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int squareSum = 0, cubeSum = 0;

        while (n != 0) {
            int d = n % 10;
            squareSum += d * d;
            cubeSum += d * d * d;
            n /= 10;
        }
        System.out.println("Sum of Squares: " + squareSum);
        System.out.println("Sum of Cubes: " + cubeSum);
    }
}
