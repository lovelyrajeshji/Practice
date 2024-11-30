interface I1
{
 void getNo();
 void book();
}
interface I2
{
 void getChacolotes();
}
class Raj implements I1,I2
{
  public void getNo()
  {
    System.out.println("hii");
   }
   public void book()
   {
    System.out.println("come");
	}
	public void getChacolotes()
	{
	 System.out.println("cha");
	}
	public static void getbike()
	{
	System.out.println("sdfghj");
	}
	public static void main(String[] args)
	{
	  Raj r = new Raj();
	  r.getNo();
	  getbike();
	}
}