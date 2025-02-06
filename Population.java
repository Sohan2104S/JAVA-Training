class Population
{
	public static void main(String[]args)
	{
		long currPop=312032486;
		long fiveYears=(365*24*60*60)*5;
		
		System.out.println("Current Population:"+currPop);
		long birth=fiveYears/7;
		long death=fiveYears/13;
		long immiGrant=fiveYears/45;

		long afterPop= currPop+(birth-death+immiGrant);

		System.out.println("Population after 5 years " +afterPop);


	}
}