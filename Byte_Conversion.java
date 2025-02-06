class Byte_Conversion

{
	public static void main(String[]args)
	{
		byte b=80;
		
		//short sh=b;
		//System.out.println(sh);
		//Conversion successfull
		
		//char ch=b;
		//System.out.println(ch);
		// error=possible lossy conversion from byte to char

		//int i=b;
		//System.out.println(i);
		//Conversion Successfull

		//long l=b;
		//System.out.println(l);
		//Conversion Successfull

		//float f=b;
		//System.out.println(f);
		//Conversion Successful in float form (80.0)

		double d=b;
		System.out.println(d);
		//Conversion Successful in double form (80.0)
		
	}
}