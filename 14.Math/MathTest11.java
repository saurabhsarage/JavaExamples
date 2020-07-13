class MathTest11
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double r1 = Math.rint(x);
        long r2 = Math.round(x);
        System.out.println("Round  "+ r1);
        System.out.println("Round  "+r2);
      }
}