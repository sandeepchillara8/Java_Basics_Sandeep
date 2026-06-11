package day9;
class Bank
{
	void deposit(String name, int amount)
	{
		System.out.println(name+ " deposited "+amount);
	}
}

public class Exercise11 {

	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		b1.deposit("Sandeep", 5000);
		

	}

}
