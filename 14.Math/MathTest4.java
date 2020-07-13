class MathTest4
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double e1 = Math.exp(x);
        double e2 = Math.expm1(x);
        System.out.println("Exponent :"+e1);
        System.out.println("Exponent minus 1 :"+e2);
    }
}