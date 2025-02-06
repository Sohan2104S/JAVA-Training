class Month
{
	public static void main(String[]args)
	{
		int month=20;
		int mon=month/12;
		int remMonth=month%12;

		System.out.println(mon+ (remMonth/10.0));
	}
}