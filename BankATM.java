import java.util.Scanner;
class BankATM
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String username1=null;
		String password1=null;
		String address=null;
		long conatact=0;
		double balance=0.0;
		for(;;)
		{
			System.out.println();
			System.out.println("      Welcome      ");
			System.out.println("       Laxmi Fund        ");
			System.out.println();
			System.out.println("1. Existing User ");
			System.out.println("2. Create Account ");
			System.out.println("Enter an option: ");
			int opt=sc.nextInt();
			System.out.println();
			if(opt==1);
			{
				if(username1=null)
				{
					System.out.println("Create your account first");
					continue;
				}
				System.out.println("  Login  ");
				System.out.println();

				for(int i=3;i>1;i--)
				{
					System.out.println();
					System.out.println("Username: ");
					String username=sc.next();
					System.out.println("Password: ");
					String password=sc.next();
					if(username.equals(username1)&&password.equals(password1))
					{
						home:
						for(;;)
						{
							System.out.println();
							System.out.println("Home Page");
							System.out.println();
							System.out.println("1. Deposit");
							System.out.println("2. Withdraw");
							System.out.println("3. Check ");
							System.out.println("4. Mini Statement");
							System.out.println("5. Logout");
							System.out.println();
							System.out.println("Enter an option: ");
							int opt1=sc.nextInt();
							System.out.println();
							switch(opt1)
							{
								case 1:{
									System.out.println("Deposit");
									System.out.println();
									System.out.println("Enter the amount: ");
									double depositAmt=sc.nextDouble();
									balance +=depositAmt;
									System.out.println("Amount Deposited Success");
									System.out.println();
									break;
								}
								case 2:{
									System.out.println("Withdraw");
									System.out.println();
									System.out.println("Enter the amount: ");
									double withdraw=sc.nextDouble();
									System.out.println("Enter the PIN: ");
									String password3=sc.next();
									if(passowrd3.equals(password1))
									{
										if(withdraw<=balance)
										{
											balance-=withdraw;
											System.out.println("Amount Debited Success");
										}
										else{
											System.out.println("Insufficient Funds");
										}
									}
									else{
										System.out.println("Wrong PIN");
									}
									break;										
								}
								case 3:{
									System.out.println("Check Balance");
									System.out.println();
									for(int j=3;j>=1;j--)
									{
										System.out.println();
										System.out.println("Enter the PIN: ");
										String password2=sc.next();
										if(password2.equals(password1))
										{
											System.out.println("Account Balance: "+balance+"rs");
											continue home;
										}
										else
										{
											System.out.println("Wrong PIN");
											System.out.println("Attempty left: "+(j-1));
										}
									}
									System.out.println("Your account has been blocked for 24 hours");
									System.exit(0);
									break;
								}
								case 4:{
									System.out.println("MINI Statement");
									break;
								}
								case 5:{
									System.out.println("Thank you for using us...!");
									System.out.println("Visit again");
									System.exit(0);
								}
							}
						}
					}
				else{
					System.out.println("Invalid Cred");
					System.out.println("Attempt Left "+(i-1));
				}
				}
				System.out.println("Thank You and Never Visit Again");
				System.exit(0);
			}
			else if(opt==2)
			{
				System.out.println();
				System.out.println("Account Creation");
				System.out.println("User Name: ");
				username1=sc.next();
				System.out.println("Password: ");
				password1 =sc.next();
				System.out.println("Address: ");
				sc.nextLint();
				System.out.println("Contact: ");
				contact=sc.nextLine();
				System.out.println("Deposit Amount: ");
				balance=sc.nextDouble();
				System.out.println();
				System.out.println("Account Crated Successfully");
			}
			else{
				System.out.println("Invalid Option");
			}
		}
	}
}
