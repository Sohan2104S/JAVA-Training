import java.util.Scanner;
class Iden
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");	
		int num=sc.nextInt();


		String str=(num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):((num%2==0&&num%5==0)?("HiTwoHiFive"):("     ."))):();
		//String str= (num%2==0&&num%5==0)?("HiTwo HiFive"):
			//((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):("      ")));

		
	}
}