package day7;

public class CountDigits {

	public static void main(String[] args)
	{
		int i=12345122;
		int count=0;
		while(i>0)
		{
		i=i/10;
		count++;
		}
		System.out.println("no of digits: " +count);

	}

}
