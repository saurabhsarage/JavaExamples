class Circle
{
   double radius;
   void setRadius(double r)
   {
       radius = r;
   }
   void area()
   {
       double a = Math.PI*radius*radius;
       System.out.println("Area      :"+a);
   }
  void circumference()  
  {
      double c = 2*Math.PI*radius;
      System.out.println("Circumference :"+c); 
   }
}

class Cylinder extends Circle
{
    double height;
    void setHeight(double h)
    {
       height = h;
    } 
    void volume()
    {
         double v = Math.PI*radius*radius*height;
         System.out.println("Volume    :"+v);
    }
   void surfaceArea()
   {
       double sa = 2*Math.PI*radius*height;
       System.out.println("Surface area :"+sa);
   }
}
class Inh2
{
     public static void main(String [] args)
    {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
       Cylinder c = new Cylinder();
       c.setRadius(r);
       c.setHeight(h);
       System.out.println("Base of cylinder\n---------------------------------");
       c.area();
       c.circumference();
       System.out.println("\nBody of cylinder\n---------------------------------");
       c.volume();
       c.surfaceArea();
    }
}

