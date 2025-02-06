import java.util.Scanner;
class Currency
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("******  Welcome to Currency Converter  *********");
		System.out.println();
		System.out.println("Enter amount in INR: ");
		float inr=sc.nextFloat();
		System.out.println();
		
		System.out.println("List od currencies ");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println();
		System.out.println("Enter the Currency: ");

		String curr=sc.next().toUpperCase();
		float conCurr=0f;
		if(curr.equals("USD")){
			conCurr=inr/86.56f;
			System.out.println(inr+ "INR" + conCurr + "USD");
		}
		else if(curr.equals("EUR")){
			conCurr=inr/90.25f;
			System.out.println(inr+ "INR" + conCurr + "Euro");
		}
		else if(curr.equals("GBP")){
			conCurr=inr/107.68f;
			System.out.println(inr+ "INR" + conCurr + "GBP");
		}
		else if(curr.equals("PKR")){
			conCurr=inr/0.31f;
			System.out.println(inr+ "INR" + conCurr + "PKR");
		}
		else{
			System.out.println("INVALID OPTION");
		}


	}
}