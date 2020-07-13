/*
n=5
-----
            *
         * *
      * * *
   * * * *
* * * * * 
*/
class StarFormation
{
  public static void main(String [] args)
  {
     int n = Integer.parseInt(args[0]);
     for(int r=1;r<=n;r++)
     {
         for(int c=1;c<=r;c++)
             System.out.print("* ");
          System.out.println();
     }
  }
}