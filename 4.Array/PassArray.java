//variable length argument
class PassArray
{
	static void vaTest(int v[])
	{
		System.out.print("Number Of args:- "+v.length+" Contents :- ");

		for(int x : v)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int n1[] = {3};
		int n2[] = {1,2,3};
		int n3[] = {};
		vaTest(n1);
		vaTest(n2);
		vaTest(n3);
	}
}