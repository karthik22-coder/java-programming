
import java.util.Scanner;

public class Q50  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        int hundred = amount / 100;
        amount = amount % 100;

        int fifty = amount / 50;
        amount = amount % 50;

        int twenty = amount / 20;
        amount = amount % 20;

        int ten = amount / 10;
        amount = amount % 10;

        int five = amount / 5;
        amount = amount % 5;

        int one = amount;
        System.out.println("Currency Notes Breakdown:");
        if (hundred > 0) System.out.println("₹100 notes: " + hundred);
        if (fifty > 0) System.out.println("₹50 notes: " + fifty);
        if (twenty > 0) System.out.println("₹20 notes: " + twenty);
        if (ten > 0) System.out.println("₹10 notes: " + ten);
        if (five > 0) System.out.println("₹5 notes: " + five);
        if (one > 0) System.out.println("₹1 notes: " + one);
    }
}
