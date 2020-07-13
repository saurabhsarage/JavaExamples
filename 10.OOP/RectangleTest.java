class Rectangle
{
    float len,br;
    
    void setDimensions(float l,float b)
    {
        len = l;
        br = b;  
    }
 
   void displayDimensions()
   {
       System.out.println("Length    :"+len);
       System.out.println("Breadth   :"+br); 
   }

  void area()
  {
      float a = len*br;
      System.out.println("Area      :"+a);
  }

  void perimeter()
  {
      float p = 2*(len+br);
      System.out.println("Perimeter :"+p);
  }
} 
  
class RectangleTest
{
   public static void main(String [] args)
   {
       float l = Float.parseFloat(args[0]);
       float b = Float.parseFloat(args[1]);
       Rectangle r = new Rectangle();  
       r.setDimensions(l,b);
       r.displayDimensions(); 
       r.area();
       r.perimeter();
   }
}