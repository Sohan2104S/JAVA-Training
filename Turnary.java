import java.util.Scanner;
class Turnary
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		String check=num%2==0?"Even":"Odd";
		System.out.println(check);
	}
}