package day5;

public class Exercise9 {
	public static void main(String[] args)
	{
		String name = "Chillara Sandeep Venkata Naga Sai Mallika Sandeep";
		System.out.println("the length of the string is:" +name.replace(" ","").length());
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("Mallika"));
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(8)); 
	}

}
