package day8;

public class SmallestDigit {

	public static void main(String[] args) 
	{
		int num = 2456;
		int smallestnum =num%10;
		while(num>0)
		{
			int lastdigit = num%10;
			if(lastdigit<smallestnum)
			{
				smallestnum=lastdigit;
			}
			num = num/10;
			
		}
		System.out.println(smallestnum);

	}

}
