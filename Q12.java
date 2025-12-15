//Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a Javaube
import java.util.Scanner;
public class Q12
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int vol=a*a*a;
    int area=6*a*a;
    int peri=12*a;
    System.out.println("Volume = " + vol);
        System.out.println("Area = " +area);
        System.out.println("Perimeter = " + peri);

}
}
