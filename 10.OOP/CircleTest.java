class Circle
{
    double rad;
 
   void setRadius(double r)
    {
         rad=r;
    }
   
    void area()
    {
        double a = Math.PI * rad*rad;
        System.out.println("Area of circle  :"+a);
    }
   
   void circumference()
   {
        double c = 2*Math.PI*rad;
       System.out.println("Circumference of circle  :"+c);
   }
}
class CircleTest
{
    public static void main(String [] args)
    {
          double r = Double.parseDouble(args[0]);
          Circle c;                 //object declaration
          c = new Circle();   //object creation
          c.setRadius(r);
          c.area();
          c.circumference(); 
    }
}