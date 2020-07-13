class MultiplesNested
{
  public static void main(String [] args)
  {
      for( int num = 1;num<=10;num++)
     {
        for(int m=1;m<=10;m++)
        {
            int p = num*m;
            System.out.print(p+"\t");
        }
     }
  }
}