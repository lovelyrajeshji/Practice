import java.util.Objects;
class Passenger implements Comparable
{
  String name;
  long cNo;
  Passenger(String name,long cNo)
  {
   this.name=name;
   this.cNo=cNo;
  }
  public String toString()
  {
    return name+""+cNo;
  }
  public boolean equals(Object o)
  {
    Passenger p = (Passenger)o;
  	
     return this.name.equals(p.name)&&this.cNo==cNo;
  }
  public int hashCode()
  {
   return Objects.hash(name,cNo);
  }
  public int compareTo(Object o)
  {
    Passenger p = (Passenger)o;
	if(this.cNo==cNo)
	 return 0;
	 else if(this.cNo>cNo)
	 return 1;
	 else
	  {
	    return -1;
	  }
   }
  }	
   