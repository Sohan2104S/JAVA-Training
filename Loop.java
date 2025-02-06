class Loop
{
	public static void main(String[]args)
	{	
		System.out.println("From 1 to 10");

		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println("From A to Z");

		for (char ch='A'; ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();

		System.out.println("From z to a");
		for(char ch='z'; ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();

		System.out.println("From digit 0 to 9");
		for(char ch='0'; ch<=9;ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();

		System.out.println("ASCII Value");
		for(int i=1;i<=127;i++)
		{
			System.out.print(i+":"+((char)i)+"     ");
		}
	}
}