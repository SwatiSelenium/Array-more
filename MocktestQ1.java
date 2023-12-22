package ArrayOnwards;

public class MocktestQ1 
{
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("sib 2");
	}
	static
	{
		System.out.println("sib 3");
	}
	
	{
		System.out.println("iib 1");
	}
	
	{
		System.out.println("iib 2");
	}
	
	{
		System.out.println("iib 3");
	}
	
	MocktestQ1()
	{
		System.out.println("const 1");
	}
	
	MocktestQ1(int a)
	{
		System.out.println("const 2");
	}
	
	public void test1()
	{
		System.out.println("NSM 1");
	}
	
	public void test2()
	{
		System.out.println("NSM 2");
	}
	
	public void test3()
	{
		System.out.println("NSM 3");
	}
	
	public static void test4()
	{
		System.out.println("SM 1");
	}
	public static void test5()
	{
		System.out.println("SM 2");
	}
	public static void test6()
	{
		System.out.println("SM 3");
	}
	public static void main(String[] args) 
	{
		test4();
		test5();
		test6();
		System.out.println("MM");
		MocktestQ1 m1 = new MocktestQ1();
		new MocktestQ1(23);
		test4();
		test5();
		test6();
		m1.test1();
		m1.test2();
		m1.test3();
		System.out.println("MM2 ");
		
	}
}
