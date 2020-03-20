//Demonstration of Inner class
class Outer1
{
	int outer_x = 100;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	class Inner
	{
		void display()
		{
			System.out.println("Display : outer_x "+outer_x);
		}
	}
}
class Outer
{
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.test();
	}
}