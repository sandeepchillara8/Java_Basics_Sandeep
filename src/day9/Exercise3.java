package day9;

class Employee
{
	String name;
	int salary;
}

public class Exercise3 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.name= "Sandeep";
		e1.salary = 10000;
		Employee e2 = new Employee();
		e2.name= "Tharun";
		e2.salary = 12000;
		Employee e3 = new Employee();
		e3.name= "Hithika";
		e3.salary = 13000;
		
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		

	}

}
