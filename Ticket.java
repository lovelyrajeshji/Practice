class Ticket
{
 int ticketNo;
 String board;
 String dest;
 Passenger p;
 Ticket(int ticketNo,String board,String dest,Passenger p)
 {
   this.ticketNo=ticketNo;
   this.board=board;
   this.dest=dest;
   this.p=p;
 }
}