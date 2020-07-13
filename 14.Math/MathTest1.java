class MathTest1
{
    public static void main(String [] args)
    {
          int ang = Integer.parseInt(args[0]);
          double rad = Math.toRadians(ang);
          double s = Math.sin(rad);
          System.out.println("Sine of "+ang+" :"+s);
    }
}