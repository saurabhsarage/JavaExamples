class Sample
{
   void display(int d)
   {
      System.out.println("Integer value is "+d);
   }

   void display(float d)
   {
      System.out.println("Float value is "+d);
   }

   void display(long d)
   {
      System.out.println("Long value is "+d);
   }

   void display(double d)
   {
      System.out.println("Double value is "+d);
   }
}
class Polymorphism
{
  public static void main(String [] args)
  {
      Sample sample = new Sample();
      int  a = 56;
      long b = 928843L;
      double c = 298.534;
      float d = 634.33f;
      sample.display(a);
      sample.display(b);
      sample.display(c);
      sample.display(d);           
  }
}