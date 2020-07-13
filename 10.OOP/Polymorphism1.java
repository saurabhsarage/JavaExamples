class Numbers
{
   int a,b;
 
   Numbers()    //default constructor
   { a=b=1; }
 
   Numbers(int n)   //constructor with 1 parameter
   { a = b = n; }

   Numbers(int x,int y)  // constructor with 2 parameters
  { a = x; b = y; }

  void display()
  {
     System.out.println("First number  :"+a+"\tSecond number  :"+b);
  }
}
class Polymorphism1
{
   public static void main(String [] args)
   {
        Numbers n1,n2,n3;
 
        n1 = new Numbers();     //invokes default constructor
        n2 = new Numbers(56); //invokes constructor with 1 parameter
        n3 = new Numbers(53,28); //invokes constructor with 2 parameters
  
        n1.display();
        n2.display();
        n3.display();
   }
}