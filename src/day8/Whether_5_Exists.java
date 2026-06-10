package day8;

public class Whether_5_Exists {

	public static void main(String[] args) {
		int num = 25545121;
		int count=0;
		while(num>0)
		{
			int lastdigit = num %10;
			if(lastdigit==5)
			{
				count++;
			}
			num = num/10;
		}
		if(count>0)
		{
			System.out.println("5 is found and digit 5 appears "+count+ " times");
			System.out.println();
			
		}
		else
		{
			System.out.println("5 is not found");
		}
		
		

	}

}
