package day2;

import java.util.Scanner;

public class Marks
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Marks");
double a= sc.nextDouble();
if (a>=35 && a<=100)
{
System.out.println("You are Passed");
}
else if (a<35)
{
System.out.println("you are Failed");
}
else
{
	System.out.println("Enter range from 0-100 only");
}
sc.close();
}
}