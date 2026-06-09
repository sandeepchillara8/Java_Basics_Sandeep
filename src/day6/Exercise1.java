package day6;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for a");
		int a= sc.nextInt();
		System.out.println("Enter number for b");
		int b= sc.nextInt();
		int c;
		c=a;
		b=a;
		c=b;
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		System.out.println(c);
		sc.close();
		

	}

}
