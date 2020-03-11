//Compute Distance Light Travels Using Long variables
class Data1
{
	public static void main(String [] args)
	{
		int lightspeed;
		long days;
		long seconds;
		long distance;
		lightspeed = 186000;
		days = 10;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		System.out.print("In "+days);
		System.out.print(" days light will travell about ");
		System.out.println(distance + " miles.");
	}
}
