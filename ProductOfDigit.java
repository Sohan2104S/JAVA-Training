import java.util.Scanner;
class ProductOfDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 digit number: ");
		int num=sc.nextInt();
		int product=1;
		int temp=0;

		int rem=num%10;
		product=product*rem;
		num=num/10;

		rem=num%10;
		product=product*rem;
		num=num/10;

		rem=num%10;
		product=product*rem;
		num=num/10;

		System.out.println("Product of 2 digits of number is "+product);

		
	}
}
