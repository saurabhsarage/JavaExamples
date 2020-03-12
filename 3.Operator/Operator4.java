//Left Shifting A Byte value
public class Operator4 
{
	public static void main (String[] args)
	{
		byte a = 60 , b;
		int i ;
		i = a << 2;
		b = (byte) (a << 2);
		System.out.println("Original Value Of a = "+a);
		System.out.println("i = "+i+" and b = "+b);
	}
}

