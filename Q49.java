import java.util.Scanner;

public class Q49  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of pens: ");
        int numberOfPens = scanner.nextInt();

        System.out.print("Enter the price per pen: ");
        double pricePerPen = scanner.nextDouble();
        int setsOfFive = numberOfPens / 5;
        
        int paidPens = setsOfFive * 3 + (numberOfPens % 5);
        
        double totalAmount = paidPens * pricePerPen;

        System.out.println("Total amount to pay: " + totalAmount);

        
    }
}
