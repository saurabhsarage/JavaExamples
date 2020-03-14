//Demonstrate Variable Length Argument
class VarArgs
{
	static void vaTest(int ... v)
	{
		System.out.print("Number Of Arguments :- "+v.length+" Contains:-  ");
		for (int x : v )
		{
			System.out.print(x + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		vaTest(15);
		vaTest(1,2,3,4);
		vaTest();
	}
}