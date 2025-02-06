class Narrowing2
{
	public static void main(String[]args)
	{

		long l=4859621;

		int i=(int)l;
		System.out.println(i);

		char ch=(char)l;
		System.out.println(ch);
		// output= ?

		short s=(short)l;
		System.out.println(s);

		byte by=(byte)l;
		System.out.println(by);
		// output= -27
		
	}
}
