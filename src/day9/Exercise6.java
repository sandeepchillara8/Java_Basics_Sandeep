package day9;

class Dog
{
	void bark(String name)
	{
		System.out.println(name+" is barking");
	}
}

public class Exercise6 {

	public static void main(String[] args) 
	{
		Dog d1= new Dog();
		d1.bark("Tommy");

	}

}
