import java.util.Scanner;
import java.util.Arrays;
class StudentDriver
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   Student s[] = new Student[5];
   s[0]= new Student("rajesh",20,21);
   s[1]=new Student("ram",60,23);
   s[2]=new Student("naresh",20,21);
   s[3]=new Student("vaibhav",33,20);
   s[4]=new Student("sai",100,19);
   boolean exit = true;
   while(exit)
   {
	System.out.println("enter the choice\n1.sortbyidAscc\n2.sortbyname\n3.sortbynameDescc\n4.sortbyAgeascc\n5.sortbyagedescc\n6.exit");
    int choice = sc.nextInt();
	switch(choice)
	{
		case 1:
		     {
               Arrays.sort(s,new SortByIdAcc());
              for(int i=0;i<s.length;i++)
              System.out.println(s[i].sid);
			 }
			 break;
		case 2:
		     {
               Arrays.sort(s,new SortByName());
              for(int i=0;i<s.length;i++)
              System.out.println(s[i].sName);
			 }
			 break;
		case 3:
		     {
               Arrays.sort(s,new SortByNameDescc());
              for(int i=0;i<s.length;i++)
              System.out.println(s[i].sName);
			 }
			 break;
		case 4:
		     {
               Arrays.sort(s,new SortByAgeAscc());
              for(int i=0;i<s.length;i++)
              System.out.println(s[i].age);
			 }
		break;
		case 5:
		     {
               Arrays.sort(s,new SortByAgeDescc());
              for(int i=0;i<s.length;i++)
              System.out.println(s[i].age);
			 }
			 break;
		case 6:
		     {
               exit=false
			 }
	}
   }
  }
}  
   