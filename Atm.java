abstract class Atm
{
  public abstract void withdraw(double amount,int pwd);
  public abstract void deposite(double amount,int pwd);
  public abstract void balanceEnquiry(int pwd);
  public abstract void changePwd(int pwd,int newpwd);
}