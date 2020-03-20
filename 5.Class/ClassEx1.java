//Simple class Example
class Box1
{
	double height;
	double weidth;
	double depth;
}
public class ClassEx1 {
	
	public static void main (String[] args) {
		Box1 box = new Box1();
		double vol;
		box.height = 12;
		box.weidth = 20;
		box.depth = 15;
		
		vol  = box.height * box.weidth * box.depth;
		System.out.println("Volume :-  "+vol);
	}
}

