import java.util.Scanner;

public class Q43  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total ingredients: ");
        int totalIngredients = scanner.nextInt();

        System.out.print("Enter ingredients needed for one cake: ");
        int ingredientsPerCake = scanner.nextInt();

        int totalCakes = totalIngredients / ingredientsPerCake;
        System.out.println("Total cakes made: " + totalCakes);
    }

}
