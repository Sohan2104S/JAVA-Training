import java.util.Scanner;
class PassFail
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your marks out of 600: ");
		int marks=sc.nextInt();

		float outMarks=(marks/600)*100;
		float per=outMarks*100;


		String pf= (per>=75&&per<=100)?("Pass with A grade"):((per>60&&per<75)?("Pass with B grade"):( (per>35&&per<60)?("pass with C grade"):("You are fail")) );
		//String pf= (per>=35)?("You are Pass"):("You are Fail");
		System.out.println(pf);
	}
}