class Narrowing
{
	public static void main(String[]args)
	{
		double a=123.00;
		
		float b=(float)a;
		System.out.println(b);

		long l=(long)a;
		System.out.println(l);

		int i=(int)a;
		System.out.println(i);

		char ch=(char)a;
		System.out.println(ch);
		// output= {

		short s=(short)a;
		System.out.println(s);


		byte by=(byte)a;
		System.out.println(by);
		
	}
}
