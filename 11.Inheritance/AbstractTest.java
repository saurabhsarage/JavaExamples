abstract class Figure
{
   double dim1,dim2;
   void setDimensions(double dim1,double dim2)
   {
       this.dim1 = dim1;
       this.dim2 = dim2;
   } 
 
  void displayDimensions()
  {
       System.out.println("First dimension :"+dim1);
       System.out.println("Second dimension :"+dim2);
   }
  abstract void area();
}

class Triangle extends Figure
{
     void area()
     {
          double a = dim1*dim2/2;
          System.out.println("Area of triangle :"+a);
      }
}

class Rectangle extends Figure
{
     void area()
    {
          double a = dim1*dim2;
          System.out.println("Area of rectangle :"+a);
    }
}
class AbstractTest
{
    public static void main(String [] args)
    {
         Triangle tri = new Triangle();
         System.out.println("Triangle\n---------------------");
         tri.setDimensions(45.6,29.8);
         tri.displayDimensions();
         tri.area();

         Rectangle rect = new Rectangle();
         System.out.println("\nRectangle\n---------------------");
         rect.setDimensions(55.4,29.8);
         rect.displayDimensions();
         rect.area();
    }
}