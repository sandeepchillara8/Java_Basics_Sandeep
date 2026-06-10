package day8;

public class DigitProblems {

	public static void main(String[] args)
	{
		int num=2241;
		int originalnum=num;
		int count=0;
		int countEven=0;
		int countOdd=0;
		int sum=0;
		int product=1;
		int sumOdd =0;
		int sumEven=0;
		int reverse =0;
		int largestdigit=0;
		int smallestdigit=num%10;
		while(num>0)
		{
			int lastdigit =num%10;
			product= product*lastdigit;
			if(lastdigit%2!=0)
			{
				countOdd++;
				sumOdd = sumOdd+lastdigit;
			}
			if(lastdigit%2==0)
			{
				countEven++;
				sumEven = sumEven+lastdigit;
			}
			if(lastdigit<smallestdigit)
			{
				smallestdigit=lastdigit;
			}
				
			if(lastdigit>largestdigit)
			{
				largestdigit=lastdigit;
			}
			reverse = reverse*10+lastdigit;
			
			sum=sum+lastdigit;
			count++;
			num=num/10;
		}
		System.out.println("No of digits are :"+count);
		System.out.println("Sum of digits are :"+sum);
		System.out.println("Product of digits are :"+product);
		System.out.println("reverse of the number is :"+reverse);
		System.out.println("Largest digit of the number is: "+largestdigit);
		System.out.println("Smallest digit of the number is: "+smallestdigit);
		System.out.println("No of even digits are :"+countEven);
		System.out.println("Sum of Even digits are :"+sumEven);
		System.out.println("No of odd digits are :"+countOdd);
		System.out.println("Sum of Odd digits are :"+sumOdd);
		
		if(reverse==originalnum)
		{
			System.out.println("given number is a Palindrome");
		}
		else
		{
			System.out.println("given number is Not a Palindrome");
		}

	}

}
