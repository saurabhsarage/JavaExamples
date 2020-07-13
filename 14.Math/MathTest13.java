class MathTest13
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.IEEEremainder(x,y);
        System.out.println("Remainder : "+r);
      }
}