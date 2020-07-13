class Person
{
   String name;
   int age;
   
   void setData(String p_name,int p_age)
   {
      name = p_name;
      age = p_age;
   }   
 
   void display()
   {
      System.out.println("Name    :"+name);
      System.out.println("Age     :"+age);
   }
}

class PersonMain
{
  public static void main(String [] args)
  {
     Person p;           //declaration
     p = new Person();   //instantiation
     p.setData("Ajit",21);
     p.display();
  }
}