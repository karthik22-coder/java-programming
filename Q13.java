//Q13.Write a Java Program to find Surface Area and Volume of a Javauboid
import java.util.Scanner;
public class Q13
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int vol=l*b*h;
    int area=2*((l*b)+(b*h)+(h*l));
    int peri=4*(l+b+h);
    System.out.println("Volume = " + vol);
        System.out.println("Area = " +area);
        System.out.println("Perimeter = " + peri);

}
}
