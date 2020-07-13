class Test
{
   int x,y,z;
   Test()        //default constructor
   {
     x=6;y=10;z=15;   
   }

   void display()
   {
     System.out.println("x="+x+"\ty="+y+"\tz="+z);
   }
}

class Constr1
{
  public static void main(String [] args)
  {
      Test t = new Test();
      t.display();
  }
}