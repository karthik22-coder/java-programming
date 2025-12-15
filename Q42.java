
    import java.util.Scanner;

public class Q42  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of candies: ");
        int totalCandies = scanner.nextInt();

        System.out.print("Enter total number of people: ");
        int totalPeople = scanner.nextInt();

        int candiesPerPerson = totalCandies / totalPeople;
        System.out.println("Each person gets " + candiesPerPerson + " candies");
    }

}
