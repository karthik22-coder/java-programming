import java.util.Scanner;

public class Q45  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter HRA (House Rent Allowance): ");
        double hra = scanner.nextDouble();

        System.out.print("Enter DA (Dearness Allowance): ");
        double da = scanner.nextDouble();

        double salary = basicSalary + hra + da;
        System.out.println("Total salary: " + salary);
    }
}

