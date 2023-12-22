package ArrayOnwards;

public class Ram 
{
	public static void main(String[] args) 
	{
		String[] name = new String[3];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Sita";
		
		int[] age = new int[3];
		age[0]=51;
		age[1]=42;
		age[2]=34;
		
		char[] gender = new char[3];
		gender[0]='M';
		gender[1]='M';
		gender[2]='F';
		
		System.out.print(name[0]+ " ");
		System.out.print(name[1]+ " ");
		System.out.println(name[2]);
		
		System.out.print(age[0]+ "   ");
		System.out.print(age[1]+ "     ");
		System.out.println(age[2]);
		
		System.out.print(gender[0]+ "    ");
		System.out.print(gender[1]+ "      ");
		System.out.println(gender[2]);
	}
}
