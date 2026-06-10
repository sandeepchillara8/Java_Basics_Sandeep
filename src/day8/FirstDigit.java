package day8;

public class FirstDigit {

	public static void main(String[] args) 
	{
		
		int num =8234;
		
		while(num>10)
		{
			num=num/10;
		}
		int firstdigit=num;
		System.out.println("firstdigit is:"+	firstdigit);

	}

}
