class Demo
{
   static int a=20;
   public static void test()
   {
	 System.out.println(a); 
   }
   static{
	     a=10;
   }
   static{
	     a=a++;
   }
   static{
	    test();
   }
   public static void main(String[] args)
  {
	
  }
 }