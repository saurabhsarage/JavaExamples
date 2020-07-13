class Test
{
   int x,y,z;
   Test(int a,int b,int c)        //parameterized constructor
   {
     x=a;y=b;z=c;   
   }

   void display()
   {
     System.out.println("x="+x+"\ty="+y+"\tz="+z);
   }
}

class Constr2
{
  public static void main(String [] args)
  {
      Test t1 = new Test(10,20,30);
      Test t2 = new Test(40,50,60);
      t1.display();
      t2.display();
  }
}