class MathTest9
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        System.out.println("Maximum : "+ Math.max(x,y));
        System.out.println("Minimum : "+ Math.min(x,y));
      }
}