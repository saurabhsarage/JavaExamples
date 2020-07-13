class Multiples
{
   public static void main(String [] args)
   {
       int num = Integer.parseInt(args[0]);
       int m = 1;
       while(m<=10)
      {
          int p = num*m;
          System.out.println(p);
          m++;
      }
   }
}