import java.util.Arrays;
class HumanDriver 
{
 public static void main(String[] args)
 {
   Human h[] = new Human[5];
   h[0]=new Human("rajesh",21,1313);
   h[1]=new Human("naresh",22,1302);
   h[2]=new Human("ram",23,1305);
   h[3]=new Human("vaibhav",25,1308);
   h[4]=new Human("shiva",25,1312);
   Arrays.sort(h,new SortBasedOnAge());
   for(int i=0;i<h.length;i++)
   {
     System.out.println(h[i].name);
   }
  }
 }
   