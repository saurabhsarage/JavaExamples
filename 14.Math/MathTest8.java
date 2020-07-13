class MathTest8
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double c = Math.ceil(x);
        double f = Math.floor(x);
        System.out.println("Round up of "+x+" is "+c);
        System.out.println("Round down of "+x+" is "+f);
      }
}