//Simple example of Recurssion
class Factorial
{
	int fact(int n)
	{
		int result;

		if(n == 1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}
class Recurssion
{
	public static void main(String[] args)
	{
		Factorial f = new Factorial();

		System.out.println("Factorial of 3 :- "+f.fact(3));
		System.out.println("Factorial of 4 :- "+f.fact(4));
		System.out.println("Factorial of 5 :- "+f.fact(5));
	}
}