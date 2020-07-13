class MathTest3
{
    public static void main(String [] args)
    {
        int num = Integer.parseInt(args[0]);
        double sr = Math.sqrt(num);
        double cr = Math.cbrt(num);
        System.out.println("Square root :"+sr);
        System.out.println("Cube root :"+cr);
    }
}