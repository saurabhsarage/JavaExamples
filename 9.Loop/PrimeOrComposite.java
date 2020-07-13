class PrimeOrComposite
{
   public static void main(String [] args)
   {
        int num = Integer.parseInt(args[0]);
        boolean flag = true;
        for(int d = 2;d<=num/2;d++)
            if(num%d==0)
            {
                 flag=false;
                 break;
             }
        if(flag)
           System.out.println("Number is prime");
        else
           System.out.println("Number is composite");     
  }
}