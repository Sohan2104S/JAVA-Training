class Narrowing3
{
	public static void main(String[]args)
	{

		int i=1234;
		

		char ch=(char)i;
		System.out.println(ch);
		// output= ?

		short s=(short)ch;
		System.out.println(s);

		byte by=(byte)i;
		System.out.println(by);
		// output= -46
		
	}
}
