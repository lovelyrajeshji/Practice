import java.util.Scanner;
class MckvDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	Mckv m = new Mckv();
	boolean exit = true;
	while(exit)
	{
	  System.out.println("enter the choice\n1.getAdd\n2.cancelAdd\n3.suspend\n4.backlogs\n5.apology\n6.Exit");
	  int choice = sc.nextInt();
	  switch(choice)
	  {
	   case 1:
	         {
			   System.out.println("Enter the student name");
			   String name = sc.next();
			   System.out.println("Enter the student id no");
			   int id = sc.nextInt();
			   System.out.println("enter the no backlogs");
			   int noOfBackLogs=sc.nextInt();
			   System.out.println("Enter the status");
			   String status =sc.next();
			   m.getAdd(new Student(name,id,noOfBackLogs,status));
			  }
			  break;
		case 2:
		      {
			    m.cancelAdd();
				System.out.println("------------------");
			   }
			   break;
		case 3:
		      {
			    
				m.suspend();
				System.out.println("---------------");
				}
			break;
		case 4:
		      {
			    m.backlogs();
				System.out.println("-------------");
			   }
			   break;
		case 5:
		     {
			   System.out.println("enter the status");
			   String status =sc.next();
			   m.apology(status);
			   System.out.println("--------------");
			 }
			 break;
			 case 6:
			     {
				   exit=false;
				  }
			}
			}
			}
			}