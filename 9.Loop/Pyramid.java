/*
n=5
-----
            1
         1 2 1
      1 2 3 2 1
   1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
class Pyramid
{
   public static void main(String [] args)
   {
        int n = Integer.parseInt(args[0]);
        for(int r=1;r<=n;r++)
        {
           for(int s=1;s<=n-r;s++)
              System.out.print("  ");

           for(int c = 1;c<r;c++)
                    System.out.print((c%10)+" ");

           for(int c = r;c>=1;c--)
              System.out.print((c%10)+" ");

            System.out.println(); 
         }       
    }
}



