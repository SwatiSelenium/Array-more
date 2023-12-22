package ArrayOnwards;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("1");
				break;
		case 2:	System.out.println("2");
				break;
		case 3: System.out.println("3");
				break;
		default :System.out.println("Default Msg");
				break;
		}	
	}

}
