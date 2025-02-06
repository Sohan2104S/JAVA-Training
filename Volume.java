import java.util.Scanner;
class Volume
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of cylinder: ");
		
		float radius=sc.nextFloat();
		float pi=22/7;
		float area=pi*radius*radius;
		System.out.println("Area of cylinder: "+area);
		
		System.out.println("Enter Height of cylinder: ");
		float height=sc.nextFloat();
		float volume=area*height;
		
		System.out.println("Volume of Cylinder is  "+volume);
	}
}