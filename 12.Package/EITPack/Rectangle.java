package EITPack;
public class Rectangle
{
   private float len,br;
   public void setDimensions(float l,float b)
    {
        len = l;
        br = b;  
    } 
   public void displayDimensions()
   {
       System.out.println("Length    :"+len);
       System.out.println("Breadth   :"+br); 
   }
  public void area()
  {
      float a = len*br;
      System.out.println("Area      :"+a);
  }
 public void perimeter()
  {
      float p = 2*(len+br);
      System.out.println("Perimeter :"+p);
  }
} 
  
