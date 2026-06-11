package day9;

class Message
{
	 String getGreeting(String name)
	 {
		 return "hello "+name;
	 }
}
public class Exercise14 {

	public static void main(String[] args) 
	{
		Message m1 = new Message();
		String result = m1.getGreeting("Sandeep");
		System.out.println(result);

	}

}
