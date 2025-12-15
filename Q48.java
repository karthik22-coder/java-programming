import java.util.Scanner;

public class Q48  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of mangoes: ");
        int numberOfMangoes = scanner.nextInt();

        System.out.print("Enter price per mango: ");
        double pricePerMango = scanner.nextDouble();

        int paidMangoes = numberOfMangoes - (numberOfMangoes / 4);
        double totalAmount = paidMangoes * pricePerMango;
        System.out.println("Total amount to pay: " + totalAmount);
    }
}
