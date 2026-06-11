package day9;

class Caluculator
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	
	int square(int a)
	{
		int result  = a*a;
		return result;
	}
}

public class Exercise7 {

	public static void main(String[] args) 
	{
		Caluculator c1 = new Caluculator();
		c1.add(5, 9);

	}

}
