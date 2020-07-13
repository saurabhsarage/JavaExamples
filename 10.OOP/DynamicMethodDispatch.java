class Person
{
   String name;
   int age;

   void setData(String nm,int a)
   {
     name = nm;
     age = a;
   }

   void display()
   {
     System.out.println("Name    :"+name);
     System.out.println("Age     :"+age);
   }
}
class DynamicMethodDispatch
{
  public static void main(String [] args)
  {
     Person person1 = new Person();
     person1.setData("Pooja",18);
     Person person2 = new Person();
     person2.setData("Ujjwal",21);
     Person person3 = new Person();
     person3.setData("Swapnil",90);   

     Person ref;
     ref = person1;
     ref.display();
     ref = person2;
     ref.display();
     ref = person3;
     ref.display();
  }
}
