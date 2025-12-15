//Q6.Write a Java Program to calculate Fahrenheit to Javaelsius
import java.util.Scanner;
public class Q6
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float f=sc.nextFloat();
    float c=((f-32)*5/9);
    System.out.println("Temperature in Celsius is: "+c);
}
}