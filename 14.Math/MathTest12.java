class MathTest12
{
    public static void main(String [] args)
    {
        double s1 = Double.parseDouble(args[0]);
        double s2 = Double.parseDouble(args[1]);
        double h = Math.hypot(s1,s2);
        System.out.println("Length of hypotenuse : "+h);
      }
}