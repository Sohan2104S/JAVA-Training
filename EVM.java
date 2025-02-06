import java.util.Scanner;
class EVM
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		System.out.println();
		System.out.println("       Welcome");
		System.out.println();
		System.out.println("Enter Population");
		int population=sc.nextInt();

		for(int i=1; i<=population;i++)
		{
			System.out.println();
			System.out.println("**** List of Parties ****");
			System.out.println("1. BJP");
			System.out.println("2. Congress");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			int opt=sc.nextInt();
			if(opt>=1&&opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("Ache Din Aayenge");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("Bharat Todo");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("Hum Hai Asli Sena");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("Mujhe Azad Karo");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("Jai Maharashtra");
				}
				if(opt==6)
				{
					bjp++;
					System.out.println("You are a educated person");
				}
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP won the elections by"+bjp+" votes");
			}
			if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("CONGRESS won the elections by"+cng+" votes");
			}
			if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("ShivSena won the elections by"+ss+" votes");
			}
			if(aap>=bjp && aap>=ss && aap>=cng && aap>=mns && aap>=nota)
			{
				System.out.println("AAP won the elections by"+aap+" votes");
			}
			if(mns>=bjp && mns>=ss && mns>=aap && mns>=cng && mns>=nota)
			{
				System.out.println("MNS won the elections by"+mns+" votes");
			}
			if(nota>=bjp && nota>=ss && nota>=aap && nota>=mns && nota>=cng)
			{
				System.out.println("No-one won the Elections ");
			}
		}
	}
}