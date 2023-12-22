// Withing the class program
package ArrayOnwards;

public class AccessSpecifier1 
{
	public void add()
	{
		System.out.println("One");
	}
	private void substract()
	{
		System.out.println("Two");
	}
	protected void multi()
	{
		System.out.println("Three");
	}
	void division()
	{
		System.out.println("Four");
	}
	public static void main(String[] args) 
	{
		AccessSpecifier1 a1=new AccessSpecifier1();
		a1.add();
		a1.division();
		a1.multi();
		a1.substract();

	}

}
