import java.util.Comparator;
class SortBasedOnAge implements Comparator
{
  public int compare(Object o1,Object o2)
  {
    Human h1 = (Human)o1;
	Human h2 =(Human)o2;
	 
	 return h1.name.compareTo(h2.name)
	//if(h1.age==h2.age)
	 //return 0;
	 //else if(h1.age>h2.age)
	 //return 1;
	 //else
	 //return -1;
   }
 }
    