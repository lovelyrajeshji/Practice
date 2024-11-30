import java.util.Scanner;
class RailwaysDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	Railways r = new Railways();
	boolean exit = true;
	while(exit)
	{
	  System.out.println("enter the choice\n1.BookTicket\n2.CancellTicket\n3.PassengerDetails\n4.ShowTicket\n5.exit");
	  int choice =sc.nextInt();
	  switch(choice)
	  {
	   case 1:
	         {
			   System.out.println("enter ticketNumber");
			   int ticketNo=sc.nextInt();
			   System.out.println("enter boarding point");
			   String board =sc.next();
			   System.out.println("enter the destination");
			   String dest = sc.next();
			   System.out.println("enter the name");
			   String name =sc.next();
			   System.out.println("enetr the contact no");
			   long cNo =sc.nextLong();
			   r.bookTicket(new Ticket(ticketNo,board,dest,new Passenger(name,cNo)));
			   System.out.println("-------------------");
			  }
			  break;
		case 2:
		      { r.cancelTicket();
				System.out.println("------------------");
			  }
			    
			 break;
		case 3:
		     {
			   r.passengerDetails();
				System.out.println("--------------------");
			   }
			break;    
		case 4:
		      {
			    r.showTicketDetails();
				System.out.println("------------------");
			  }
		     break;
        case 5:
              {
                 exit=false;
              }
        }
      }
    }
  }	