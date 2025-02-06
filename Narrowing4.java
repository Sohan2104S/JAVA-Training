class Narrowing4
{
	public static void main(String[]args)
	{

		char ch='w';

		short s=(short)ch;
		System.out.println(s);

		byte by=(byte)ch;
		System.out.println(by);
		// output= 119
		
	}
}
