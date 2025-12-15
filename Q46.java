import java.util.Scanner;

public class Q46  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter profit amount: ");
        double profit = scanner.nextDouble();

        double sellingPrice = costPrice + profit;
        System.out.println("Selling Price: " + sellingPrice);
    }
}
