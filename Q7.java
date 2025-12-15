//Q7.Write a Java Program to calculate Javaelsius to Fahrenheit
import java.util.Scanner;
public class Q7
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float c=sc.nextFloat();
    float f=(((9/5)*c)+32);
    System.out.println("Temperature in Fahrenheit is: "+f);
}
}