package ArrayOnwards;

public class Assign55 
{
	public static void main(String[] args) 
	{
		String[] city = new String[5];
		city[0]="Pune";
		city[1]="Nagpur";
		city[2]="Amravati";
		city[3]="Mumbai";
		city[4]="Hyderabad";
		
		boolean[] ans = new boolean[5];
		ans[0]=true;
		ans[1]=false;
		ans[2]=true;
		ans[3]=false;
		ans[4]=false;
		
		String[] msg = new String[5];
		msg[0]="I will visit soon";
		msg[1]="I have been here";
		msg[2]="This is my Fav City";
		msg[3]="I havn't been there";
		msg[4]="Visited many times";
		
		System.out.print(city[0]+ "       ");
		System.out.print(ans[0]+ "   ");
		System.out.println(msg[0]);
		
		System.out.print(city[1]+ "     ");
		System.out.print(ans[1]+ "  ");
		System.out.println(msg[1]);
		
		System.out.print(city[2]+ "   ");
		System.out.print(ans[2]+ "   ");
		System.out.println(msg[2]);
		
		System.out.print(city[3]+ "     ");
		System.out.print(ans[3]+ "  ");
		System.out.println(msg[3]);
		
		System.out.print(city[4]+ "  ");
		System.out.print(ans[4]+ "  ");
		System.out.println(msg[4]);
		
	
	}
}
