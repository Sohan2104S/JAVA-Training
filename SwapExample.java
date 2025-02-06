class SwapExample
{
	public static void main(String args[])
	{	
		int a=2;
		int b=4;
		
		System.out.println("Before swaping: "+a);
		System.out.println("Before swaping: "+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swaping: "+a);
		System.out.println("After swaping: "+b);

	}
}