class SumSeries
{
   public static void main(String [] args)
   {
        int n = Integer.parseInt(args[0]);
        double s = 0.0;
        for(int i=1;i<=n;i++)
        {
          /*  double x=1.0;
               for(int j=1;j<=i;j++)
                    x = x * 1.0/i;                   
               s=s+x;
          */  
           s = s + Math.pow(1.0/i,i);
        }
       System.out.println("Value of s = "+s); 
  }
}