package day7;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num=1331;
		int originalnum =num;
		int reverse =0;
		while(num>0)
		{
			int lastdigit=num%10;
			reverse = reverse*10+lastdigit;
			num=num/10;
		}
		System.out.println(reverse);
		
		if(reverse==originalnum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
