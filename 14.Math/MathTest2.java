class MathTest2
{
    public static void main(String [] args)
    {
          double s = Double.parseDouble(args[0]);
          double rad = Math.asin(s);
          double ang = Math.toDegrees(rad);
          System.out.println("Angle of Sine "+s+" :"+ang);
    }
}