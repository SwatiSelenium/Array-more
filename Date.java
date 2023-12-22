package ArrayOnwards;

public class Date {

	public static void main(String[] args) 
	{
		String a= "12 Dec 2021";
		System.out.print("Day = ");
		System.out.println(a.substring(0, 2));
		System.out.print("Month = ");
		System.out.println(a.substring(3, 6));
		System.out.print("Year = ");
		System.out.println(a.substring(7));
	}

}
