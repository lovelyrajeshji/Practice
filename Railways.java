class Railways
{
  Ticket t;
  public void bookTicket(Ticket t)
  {
    if(this.t==null)
	{
	  this.t=t;
	  System.out.println("Ticket booked");
	}
	else
	{
	  System.out.println("already ticket booked");
	}
  }
  public void cancelTicket()
  {
    if(this.t==null)
	{
	  System.out.println("you are not booked ticket");
	}
	else
	{  this.t=null;
	  System.out.println("ticket cancelled");
	}
   }
  public void passengerDetails()
  {
    if(this.t==null)
	{
	  System.out.println("you are not booked ticket");
	}
	else
	{
	  System.out.println(t.p.name);
	  System.out.println(t.p.cNo);
	}
  }
 public void showTicketDetails()
 {
   if(this.t==null)
    {
      System.out.println("ticket details not  found bcoz you are not not booked");
    }
   else
    {
      System.out.println(t.ticketNo);
	  System.out.println(t.board);
	  System.out.println(t.dest);
	}
  }
 }