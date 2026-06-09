package day2;
import java.util.Scanner;

public class Positive {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Number");
		int a= sc.nextInt();
		if(a>0)
		{
			System.out.println("Your Number is Positive");
		}
		else if(a==0)
		{
			System.out.println("Your Number is Whole number");
		}
		else
		{
			System.out.println("Your Number is Negative number");
		}
		sc.close();

	}

}
