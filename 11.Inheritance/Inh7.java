class Base
{ 
    Base(int v)
    {
         System.out.println("Inside Base class's Constructor, value is "+v);
    }
}

class Derived extends Base
{
    Derived(int a)
    {
         super(a);  //invokes super class constructor having one integer argument
         System.out.println("Inside Derived class's Constructor");
    }
}

class Inh7
{
   public static void main(String [] args)
  {
     int x = Integer.parseInt(args[0]);  
     new Derived(x); 
  }
}