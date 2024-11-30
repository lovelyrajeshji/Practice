import java.util.Comparator;
class SortByIdAcc implements comparator
{
  public int compare(Object o1,Object o2)
  {
    Student s1 = (Student)o1;
	Student s2 = (Student)o2;
	if(s1.sid==s2.sid)
	return 0;
	else if(s1.sid>s2.sid)
	return 1;
	else
	  return -1;
  }
}