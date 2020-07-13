class MathTest10
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        System.out.println("Next after : "+ Math.nextUp(x));
        System.out.println("Next towards 100 : "+ Math.nextAfter(x,100));
      }
}