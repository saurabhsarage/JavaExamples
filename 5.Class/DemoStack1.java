//Demonstration of Stack Class
class Stack
{
	int stck []  = new int[10];
	int tos;

	Stack()
	{
		tos = -1;
	}
	void push(int item)
	{
		if(tos == 9)
			System.out.println("\nStack is full");
		else
		{
			stck[++tos] = item;
		}
	}
	int pop()
	{
		if(tos<0)
		{
			System.out.println("\nStack is UnderFlow");
			return 0;
		}
		else
		{
			return stck[tos--];
		}
	}
}
class DemoStack
{
	public static void main(String[] args)
	{
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();

		for(int i = 0;i <= 10;i++)
			stack1.push(i);

		for(int i = 10;i <= 20;i++)
			stack2.push(i);

		for(int i = 0;i <= 10;i++)
		{
			System.out.println(stack1.pop());
		}

		for(int i = 10;i <= 20;i++)
			System.out.println(stack2.pop());
	}
}