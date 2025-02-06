import java.util.Scanner;
class Vowel
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char a=sc.next().charAt(0);
		

		String str= (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')?(a+" is a vowel"):(a+" is a consonant");

		System.out.println(str);
	}
}