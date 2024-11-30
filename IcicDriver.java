import java.util.Scanner;
class IcicDriver
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   IcicAtm c=new IcicAtm();
  // Account a1 = new Account(44861010050l,500.00,4486);
   boolean exit = true;
   while(exit)
   {
    System.out.println("enter your choice\n1.createAccount\n2.withdraw\n3.deposite\n4.balanceEnquiry\n5.changepwd\n6.exit");
	int choice = sc.nextInt();
	switch(choice)
	{
	 case 1:
	       {
		     System.out.println("enter the account number");
			 long accNo=sc.nextLong();
			 System.out.println("enter the amount");
			 double balance = sc.nextDouble();
			 System.out.println("enter the password");
			 int pwd = sc.nextInt();
			 c.createAccount(new Account(accNo,balance,pwd));
			 System.out.println("----------------------");
		   }
		   break;
	  case 2:
	       {
		     System.out.println("enter the amount");
			 double balance = sc.nextDouble();
			 System.out.println("enter the pwd");
			 int pwd =  sc.nextInt();
			 c.withdraw(balance,pwd);
		   }
		   break;
	   case 3:
	         {
			  System.out.println("enter the amount");
			  double balance = sc.nextDouble();
			  System.out.println("enter the pwd");
			  int pwd =  sc.nextInt();
			  c.deposite(balance,pwd);
			  }
			  break;
	   case 4:
	         {
			   System.out.println("enter the pwd");
			   int pwd =  sc.nextInt();
			   c.balanceEnquiry(pwd);
			  }
			  break;
	   case 5:
	         {
			   System.out.println("enter the old password");
			   int pwd = sc.nextInt();
			   System.out.println("enter the new pwd");
			   int newpwd =sc.nextInt();
			   c.changePwd(pwd,newpwd);
			  }
			  break;
	   case 6:
	         {
			   exit = false;
			 }
		}
	}
  }
}