import java.util.Scanner;
class IntAdd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number between 0 to 1000");
		
		int num=sc.nextInt();

		int sum=0;

		
		sum=num%10;
		num=num/10;

		sum=num%10;
		num=num/10;

		sum=num%10;

		System.out.println("Sum of entered number is: "+sum);
	
	}
}