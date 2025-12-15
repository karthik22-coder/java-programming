//Q5.Write a Java Program to find the distance between two points
import java.util.Scanner;
public class Q5
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int dis=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.println("Distance between two points is: "+dis);
}
}