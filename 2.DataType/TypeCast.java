//This Program Demonstrate The Type casting
class TypeCast
{
	public static void main(String args [])
	{
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("Conversion of int to byte");
		b = (byte)i;
		System.out.println("Now B is :- "+b);
		System.out.println("Conversion of double to int");
		i = (int)d;
		System.out.println("Now I is :- "+i);
		System.out.println("Conversion of double to byte");
		b = (byte)d;
		System.out.println("Now I is :- "+b);
	}
}
