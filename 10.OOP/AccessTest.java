class Test
{
   private void show()
    {
        System.out.println("Inside method show()");
   }
   private void display()
    {
        System.out.println("Inside method display()");
   }
   void testMethod()
   {
       show();
       display();
   }
}

class AccessTest
{
   public static void main(String [] args)
   {
        Test test = new Test();
         test.testMethod();
   }
}

