//Demonstration of Method Overloading
class Overload
{
	void test()
	{
		System.out.print("\nNo Parameter");
	}

	void test(int a)
	{
		System.out.print("\nInt A : - "+a);
	}

	void test(int a,int b)
	{
		System.out.print("\nA : - "+a+"\nB : - "+b);
	}

	double test(double a)
	{
		System.out.print("\nDouble A : - "+a);
		return a*a;
	}
}
class OverloadDemo
{
	public static void main(String[] args)
	{
		Overload over = new Overload();
		double area;

		over.test();
		over.test(10);
		over.test(10,30);
		area = over.test(12.66);
		System.out.print("\nResult :- "+area);
	}
}