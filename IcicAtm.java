class IcicAtm extends Atm
{
 Account a;
 public void createAccount(Account a)
 {
   if(this.a==null)
    {
	   this.a=a;
	   System.out.println("Account is created");
	}
	else
	  {
	    System.out.println("Account is already exists");
	  }
 }
	  
 public void withdraw(double amount,int pwd)
 {
   if(this.a==null)
    {
	  
	  System.out.println("Account is not their:Create account");
	}
	else
	{
	  
	  if(a.pwd==pwd)
	  {
	    if(a.balance>=amount)
		{
		   a.balance-=amount;
		   System.out.println("Amount withdraw successfull\n: available balance is"+a.balance);
		}
		else
		 {
		   
		   System.out.println("insufficent balance");
		 }
	   }
	   else
	   {    
		   System.out.println("pwd not matched");
	   }
	   
	  
	}
  }
  public void deposite(double amount,int pwd)
  {
    if(this.a==null)
	{
	 System.out.println("Account not exist");
	}
	else
	{
		
		if(a.pwd==pwd)
		{
			a.balance+=amount;
			System.out.println("Amount added into your account");
	    }
		else
		{
			
			System.out.println("pwd not matched");
		}
	}
  }
  public void balanceEnquiry(int pwd)
  {
	  if(this.a==null)
	  {
		System.out.println("account not exist");
	  }
	  else
	  {
		 
		 if(a.pwd==pwd)
		 {
			 System.out.println(a.balance);
		 }
	    else
		{
			System.out.println("pwd not matched");
		}
	  }
  }
  public void changePwd(int pwd,int newpwd)
  {
	  if(this.a==null)
	  {
		 System.out.println("account not exist");
	  }
	  else
	  {
		  
		  if(a.pwd==pwd)
		  {
			 a.pwd=newpwd;
			System.out.println("pwd changed");
		  }
		  else
		  {
			System.out.println("pwd wrong");
		  }
	  }
  }
  
}