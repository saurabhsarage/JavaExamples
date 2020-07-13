class SCSR
{
   public static void main(String [] args)
   {
       int n = Integer.parseInt(args[0]);
       for(int i = 1;i<=n;i++)
       {
          int sq = i*i;
          int cb = i*i*i;
          double sr = Math.sqrt(i);
          double cr = Math.cbrt(i);
          System.out.printf("%d\t%d\t%d\t%.3f\t%.3f\n",i,sq,cb,sr,cr); 
       }
   }
}