//Demonstrate Inner class within for loop
class Outer
{
	int outer_x = 100;

	void test()
	{
		for(int i=0;i<10;i++)
		{
			class Inner
			{
				void display()
				{
					System.out.println("Outer x :- "+outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}
class InnerDemo
{
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}