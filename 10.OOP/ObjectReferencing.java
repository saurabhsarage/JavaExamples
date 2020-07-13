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
class ObjectReferencing
{
  public static void main(String [] args)
  {
     Person person = new Person();
     person.setData("Pooja",18);
     Person ref;
     ref = person;
     person.display();
     ref.display();
  }
}
