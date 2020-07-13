import EITPack.Circle;
class Cylinder extends EITPack.Circle
{    
     void set()
     {
          setRadius(4.5);
     }
}

class PackageTest1
{
   public static void main(String [] args)
   {
         Cylinder c = new Cylinder();
         c.set();
         c.area();
         c.circumference();
   }
}