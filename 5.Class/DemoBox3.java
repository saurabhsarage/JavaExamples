class Box3
{
	double height;
	double weidth;
	double length;

	void display()
	{
		System.out.println("Volume is :- "+weidth*height*length);
	}
}
class DemoBox3
{
	public static void main(String[] args)
	{
		Box3 box1 = new Box3();
		Box3 box2 = new Box3();

		box1.height = 10.8;
		box1.weidth = 15.23;
		box1.length = 20.14;

		box2.height = 10;
		box2.weidth = 15;
		box2.length = 20;

		box1.display();
		box2.display();
	}
}