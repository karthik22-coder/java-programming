//Q14.Write a Java Program to find Surface Area and Volume of a Sphere
import java.util.Scanner;
public class Q14
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r = sc.nextInt();
   
    int vol=(int) ((4/3)*3.14*(r*r*r));
    int area=(int) (4*3.14*(r*r));
    int circum=(int) (2*3.14*r);
    System.out.println("Volume = " + vol);
        System.out.println("Area = " +area);
        System.out.println("Circumference = " + circum);
             
}       

}
