//Demonstration of Access Specifiers
class Test
{
	int a;
	public int b;
	private int c;

	void setc(int i)
	{
		c = i;
	}
	int getc()
	{
		return c;
	}
}
class AccessTest
{
	public static void main(String[] args)
	{
		Test ob = new Test();

		ob.a = 10;
		ob.b = 20;

	//	ob.c = 100;

		ob.setc(50);

		System.out.println("a, b , c :- "+ob.a+" "+ob.b+"  "+ "  "+ob.getc() );
	}
}