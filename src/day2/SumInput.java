package day2;
import java.util.Scanner;

public class SumInput {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter First Number");
		int a= sc.nextInt();
		System.out.println("Enter Second Number");
		int b= sc.nextInt();
		
		System.out.println("your sum is: "+ (a+b));*/
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("eligible to Vote");
		}
		else
			System.out.println("Not eligible to vote");
		sc.close();
		

	}

}
