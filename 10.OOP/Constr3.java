class Box
{
  double length,width,height;
  Box(double l,double w,double h)
  {
     length=l;
     width=w;
     height=h;
  }
  void displayDimensions()
  {
    System.out.println("Length :"+length+"\tWidth  :"+width+"\tHeight  :"+height);
  }

  void volume()
  {
     double vol = length*width*height;
     System.out.println("Volume  :"+vol);
  }
}
class Constr3
{
  public static void main(String [] args)
  {
    Box b1,b2,b3;
    b1 = new Box(23.4,19.3,20.0);
    b2 = new Box(35.4,19.2,19.0);
    b3 = new Box(10.5,9.2,10.5);

    System.out.println("\nBox 1");
    b1.displayDimensions();
    b1.volume();

    System.out.println("\nBox 2");
    b2.displayDimensions();
    b2.volume();

    System.out.println("\nBox 3");
    b3.displayDimensions();
    b3.volume(); 
  }
}