package day7;

public class LargestNumber {

	public static void main(String[] args) 
	{
		int num=529212337;
		int largest =0;
		while(num>0)
		{
			int lastdigit = num%10;
			if(lastdigit>largest)
			{
				largest = lastdigit;
			}
			num =num/10;
		}
		System.out.println(largest);
		

	}

}
