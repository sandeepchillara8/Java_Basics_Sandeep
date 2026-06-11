package day9;
class Car
{
	String brand;
	int speed;
}

public class Exercise4 {

	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.brand = "AUDI";
		c1.speed = 250;
		
		Car c2 = new Car();
		c2.brand = "BENZ";
		c2.speed = 280;
		
		Car c3 = new Car();
		c3.brand = "BMW";
		c3.speed = 290;
		
		System.out.println(c1.brand);
		System.out.println(c1.speed);
		System.out.println(c2.brand);
		System.out.println(c2.speed);
		System.out.println(c3.brand);
		System.out.println(c3.speed);

	}

}
