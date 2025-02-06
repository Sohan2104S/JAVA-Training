import java.util.Scanner;
class MinutesToYear
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter minutes: ");
		long minutes=sc.nextLong();

		long years=minutes/(60*24*365);

		long remMinutes=minutes%(60*24*365);

		long days=remMinutes/(60*24);

		System.out.println(minutes+ " minutes is approximatesly "+years+"years and "+days+" days.");
		
		
	}
}