//Q9.Write a Java Program to find Perimeter of a Rectangle
import java.util.Scanner;
public class Q9
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
   
    System.out.println("Perimeter of rectangle:"+(2*(l+b)));
}
}