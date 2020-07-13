class BinaryNumber
{
    public static void main(String [] args)
    {
          int num = Integer.parseInt(args[0]);
          long bin = 0;
          int i = 0;
          while(num!=0)
          {  
              long d = num%2;
              num = num/2;
              bin = bin+d * (long) Math.pow(10,i);
              i++;  
          }
          System.out.print(bin);
    }
}