package day7;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int num=123444;
		int reverse =0;
		while(num>0)
		{
			int lastdigit = num%10;
			reverse = reverse *10+lastdigit;
			num=num/10;
			
		}
		System.out.println(reverse);

	}

}
