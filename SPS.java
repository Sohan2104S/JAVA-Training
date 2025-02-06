import java.util.Scanner;
class SPS
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int rNum=0;
		for()
		{
			int num=(int)(Math.random()*10);
			if (num>=1&&num<=3)
			{
				System.out.println(num+" ");
				rNum=num;
				break;
			}
		}
		String codeOpt=null;
		if(rNum==1)
		{
			userOpt="STONE";
		}
		else if(rNum==2)
		{
			userOpt="Paper";
		}
		else if(rNum==3)
		{
			userOpt="Scissor";
		}
		else{
			System.out.println("INVALID CHOICE");
			return;
		}
	}
}