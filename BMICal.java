import java.util.Scanner;
class BMICal
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight in Pound:  ");
		double kg=sc.nextFloat();

		System.out.print("Enter height in INCH:  ");
		double in=sc.nextFloat();
		
		
		double pound=0.45359237;
		double kilo=kg*pound;
		

		double bmi=kg/(in*in);
		
		System.out.println("Your BMI is: "+bmi);

		
	}
}