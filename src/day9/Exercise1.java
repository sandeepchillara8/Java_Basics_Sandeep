package day9;

class Student
{
	String name;
	int age;
	
	void study(String subject)
	{
		System.out.println("Studying "+ subject);
	}
	
	String getName(String name)
	{
		return name;
	}
}




public class Exercise1 {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name ="Sandeep";
		s1.age = 27;
		System.out.println(s1.name);
		System.out.println(s1.age);
	}

}
