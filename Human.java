class Human 
{
 String name;
 int age;
 int id;
 Human(String name,int age,int id)
 {
   this.name=name;
   this.age=age;
   this.id=id;
 }
 public String toString()
 {
   return name+""+age;
 }
}