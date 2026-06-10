package day8;

public class CountEvenDigits {

	public static void main(String[] args) 
	{
		int num = 23451;
		int count =0;
		while(num>0)
		{
			int lastdigit = num%10;
			if (lastdigit%2==0)
			{
				count++;
			}
			num = num/10;
		}
		System.out.println(count);

	}

}
