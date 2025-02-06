class Narrowing1
{
	public static void main(String[]args)
	{
		
		float b=125.00f;

		long l=(long)b;
		System.out.println(l);

		int i=(int)b;
		System.out.println(i);

		char ch=(char)b;
		System.out.println(ch);
		// output= }
		
		short s=(short)b;
		System.out.println(s);

		byte by=(byte)b;
		System.out.println(by);
		
	}
}
