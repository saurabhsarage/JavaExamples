/*
n=5
-----
            *
         * *
      * * *
   * * * *
* * * * * 
*/
class StarFormation1
{
  public static void main(String [] args)
  {
     int n = Integer.parseInt(args[0]);
     for(int r=n;r>=1;r--)
     {
         for(int s=1;s<=n-r;s++)
             System.out.print(" ");
         for(int c=1;c<=r;c++)
             System.out.print("* ");
          System.out.println();
     }
  }
}