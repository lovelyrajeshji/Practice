import java.util.Arrays;
class Student1Driver
{
  public static void main(String[] args)
  {
   Student s[] = new Student[5];
   s[0]= new Student("rajesh",20,21);
   s[1]=new Student("ram",60,23);
   s[2]=new Student("naresh",20,21);
   s[3]=new Student("vaibhav",33,20);
   s[4]=new Student("sai",100,19);
   
   Arrays.sort(s,new SortByIdAcc());
   for(int i=0;i<s.length;i++)
   {
     System.out.println(s[i].sid);
   }
  }
} 