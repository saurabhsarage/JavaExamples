class MathTest5
{
    public static void main(String [] args)
    {
        double x = Double.parseDouble(args[0]);
        double l1 = Math.log(x);
        double l2 = Math.log10(x);
        double l3 = Math.log1p(x);
        System.out.println("Natural log :"+l1);
        System.out.println("Base 10 log :"+l2);
        System.out.println("Natural log plus 1 :"+l3);
    }
}