//This Shows the Conditional Statement 
// Simple Use of If else Statements
class Simple3
{
	public static void main(String args [])
	{
		int x,y;
		x = 10;
		y = 20;
		if(x < y) // Checks is 'x' is less than 'y'
		{
			// If 'x' is less than 'y' Execute this block
			System.out.println("X is Less Than Y"); 
		}
		x = x*2; 
		if(x == y) // Checks whether x is equal to y
		{
			System.out.println("X is Equal to Y");
		}
		x = x*2;
		if(x > y)// Checks whether x is greater than y
		{
			System.out.println("Now X is Greater");
		}
		if (x == y)
		{
			System.out.print("You Won't see This ");
		}
	}
}
