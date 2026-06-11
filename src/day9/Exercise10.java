package day9;

class Greeter
{
	void greet(String name, String city)
	{
		System.out.println("Hello "+name+ " from "+ city);
	}
}

public class Exercise10 {

	public static void main(String[] args) 
	{
		Greeter g1 = new Greeter();
		g1.greet("Sandeep", "hyderabad");

	}

}
