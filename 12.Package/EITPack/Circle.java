package EITPack;
public class Circle
{
   private double rad;
 
   public void setRadius(double r)
    {
         rad=r;
    }
   
   public void area()
    {
       double a = Math.PI * rad*rad;
        System.out.println("Area of circle  :"+a);
    }
   
   public void circumference()
   {
      double c = 2*Math.PI*rad;
        System.out.println("Circumference of circle  :"+c);
   }
}
