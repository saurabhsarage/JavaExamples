class ReverseNumber
{
    public static void main(String [] args)
    {
          int num = Integer.parseInt(args[0]);
          while(num!=0)
          {  
              int d = num%10;
              num = num/10;
              System.out.print(d);
          }
    }
}