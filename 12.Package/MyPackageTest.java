import EITPack.Circle;
import EITPack.Rectangle;

class MyPackageTest
{
    public static void main(String [] args)
    {
        Circle circle = new Circle();
        circle.setRadius(23.4);
        circle.area();
        circle.circumference();
    
        Rectangle rect = new Rectangle();
        rect.setDimensions(78.6f,45.6f);
        rect.area();
        rect.perimeter();
    }
}