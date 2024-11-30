class Mckv implements Colleage
{
  Student s;
  public void getAdd(Student s)
  {
    if(this.s==null)
	{
	  this.s=s;
		System.out.println("admission granted");
	}
	else
	{
	 System.out.println("already admission is their");
	}
  }
  public void cancelAdd()
  {
    if(this.s==null)
	{
	  System.out.println("student not admitted");
	}
	else
	{
	  
	  System.out.println("studnt admission cancelled");
	}
  }
  public void suspend()
  {
    if(this.s==null)
	{
	  System.out.println("studnt not admitted");
	}
	else
	{
	  //this.=null;
	  s.status="suspend";
	  System.out.println("student suspend");
	}
  }
  public void backlogs()
  {
    if(this.s==null)
	{
	  System.out.println("student not found");
	}
	else
	{
	  System.out.println(s.noOfBackLogs);
	}
  }
  public void apology(String status)
  {
    if(this.s==null)
	{
	  System.out.println("student not found");
	}
	else
	{
	  //this.s=null;
	  s.status=status;
	  System.out.println("updated");
	}
  }
}
	  