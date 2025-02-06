import java.util.Scanner;
class PoundToKilo
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight in Pound:  ");
		double kg=sc.nextFloat();
		
		double pound=0.454;
		double kilo=kg*pound;

		System.out.println(kg+" Kilogram in Pound is "+kilo);
	}
}