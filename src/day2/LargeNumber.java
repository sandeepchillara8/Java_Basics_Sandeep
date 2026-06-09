package day2;
import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first Number");
		int a = sc.nextInt();
		System.out.println("Enter Your Second Number");
		int b = sc.nextInt();
		
		if (a>b)
		{
			System.out.println("a is larger: "+ a);
		}
		else if (a==b)
		{
			System.out.println("both are same");

		}
		else
		{
			System.out.println("b is larger: "+ b);
		}
		sc.close();
		

	}

}
