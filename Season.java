import java.util.Scanner;
class Season
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your month ");
		String month=sc.next().toUpperCase();


		String seo= (month.equals('jan')||month.equals('oct')||month.equals('nov')||month.equals('dec'))?("It's Winter"):((month.equals('feb')||month.equals('mar')||month.equals('apr')||month.equals('may'))?("It's Summer"):((month.equals('jun')||month.equals('jul')||month.equals('aug')||month.equals('spt'))?("It's Monsoon"):("Invalid month")));
		//String pf= (per>=35)?("You are Pass"):("You are Fail");
		System.out.println(seo);
	}
}