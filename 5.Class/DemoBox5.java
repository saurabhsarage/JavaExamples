//Demonstration of method passing parameter
class Box5
{
	double height;
	double weidth;
	double length;

	double display()
	{
		return weidth*height*length;
	}
}
class DemoBox5
{
	public static void main(String[] args)
	{
		Box5 box1 = new Box5();
		Box5 box2 = new Box5();
		double vol;
		box1.height = 10.8;
		box1.weidth = 15.23;
		box1.length = 20.14;

		box2.height = 10;
		box2.weidth = 15;
		box2.length = 20;

		vol = box1.display();
		System.out.println("Volume :- "+vol);
		vol = box2.display();
		System.out.println("Volume :- "+vol);
	}
}