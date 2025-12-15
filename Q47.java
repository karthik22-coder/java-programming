import java.util.Scanner;

public class Q47  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();

        System.out.print("Enter loss amount: ");
        double loss = scanner.nextDouble();

        double costPrice = sellingPrice - loss;
        System.out.println("Cost Price: " + costPrice)
    }
}
