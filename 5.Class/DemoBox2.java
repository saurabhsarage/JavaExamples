//Demonstrate Tow objects of classes
class Box2
{
	double height,weidth,length;
}
class DemoBox2
{
	public static void main(String[] args)
	{
		Box2 box1 = new Box2();
		Box2 box2 = new Box2();

		box1.height = 10;
		box1.weidth = 20;
		box1.length = 30;

		box2.height = 3;
		box2.weidth = 6;
		box2.length = 9;

		double vol = box1.height * box1.weidth * box1.length;
		System.out.print("\nVolume of first Box :- "+vol);

		vol = box2.height * box2.weidth * box2.length;
		System.out.print("\nVolume of second Box :- "+vol);
	}
}