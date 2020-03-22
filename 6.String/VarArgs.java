// Demonstrating Variable length Argument

class VarArgs
{
	static void vaTest(int ... v)
	{
		System.out.println("Number of Argument:-"+v.length+" Contents:- ");

		for(int x : v){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(10);
		vaTest(10,20,30);
		vaTest();
	}
}