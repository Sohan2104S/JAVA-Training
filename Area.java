import java.util.Scanner;

class Area
{
	public static void main(String[]args)
	{
		final float pi =22/7;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius od Circle");
		int r=sc.nextFloat();
		
		float area= pi*(r*r);

		System.out.println("Area of Circle for radius" +r+ "cm" + "is" + area + "cm.square");
	}
}