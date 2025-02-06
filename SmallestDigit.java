import java.util.Scanner;
class SmallestDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		
		int a=num%10;
		num=num/10;

		int b=num%10;
		num=num/10;

		int c=num%10;
		num=num/10;
		
		int small=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));

		System.out.println("Smallest digit of Given number is : "+small);
		
		
	}
}