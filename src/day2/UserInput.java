package day2;
import java.util.Scanner;

public class UserInput 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter your age: ");
		int age = sc.nextInt();
		
		
		System.out.println("You are " + age + " Years Old");
		 sc.close();

	}

}
