import java.util.Scanner;
public class Q38   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double totalBill = scanner.nextDouble();

        double amountPerFriend = totalBill / 3;
        System.out.println("Each friend needs to pay: " + amountPerFriend);
    }

}
