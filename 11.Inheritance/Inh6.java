class Base
{
    Base()
    {
         System.out.println("Inside Base class's Constructor");
    }
}

class Derived extends Base
{
    Derived()
    {
         System.out.println("Inside Derived class's Constructor");
    }
}

class Inh6
{
   public static void main(String [] args)
  {
      new Derived(); 
  }
}