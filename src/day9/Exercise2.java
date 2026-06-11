package day9;

class Mobile
{
	String brand;
	int price;
	
	void call()
	{
		System.out.println("calling");
	}
}

public class Exercise2 {

	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();
		m1.brand= "Oneplus";
		m1.price = 35000;
		Mobile m2 = new Mobile();
		m2.brand = "IQOO";
		m2.price= 34000;
		
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m2.brand);
		System.out.println(m2.price);

	}

}
