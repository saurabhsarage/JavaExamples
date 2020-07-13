class Shape
{
    double dim1,dim2;
    void setDimensions(double dim1,double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;  
    }
    void displayDimensions()
   {
       System.out.println("First dimension   :"+dim1);
       System.out.println("Second dimension   :"+dim2); 
   }   
}

class Triangle extends Shape
{
    void area()
    {
          double a = dim1*dim2/2;
          System.out.println("Area of triangle :"+a);
     }
    void displayDimensions()
   {
       System.out.println("Base   :"+dim1);
       System.out.println("Height   :"+dim2); 
   }   
}

class Rectangle extends Shape
{
    void area()
    {
          double a = dim1*dim2;
          System.out.println("Area of rectangle :"+a);
     }
     void perimeter()
     {
          double p = 2*(dim1+dim2);
          System.out.println("Perimeter of rectangle  :"+p); 
     }
    void displayDimensions()
   {
       System.out.println("Length   :"+dim1);
       System.out.println("Breadth   :"+dim2); 
   }    
}
class Inh5
{
   public static void main(String [] args)
   {
          Triangle t = new Triangle();
          t.setDimensions(34.56,29.40);
          Rectangle r = new Rectangle();
          r.setDimensions(78.65,29.40);
          System.out.println("Triangle \n-------------------------");
          t.displayDimensions();
          t.area();
          System.out.println("\nRectangle\n-------------------------");
          r.displayDimensions();
          r.area();
          r.perimeter();
   }
}