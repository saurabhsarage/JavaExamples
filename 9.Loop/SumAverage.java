class SumAverage
{
   public static void main(String [] args)
   {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;
        do
        {
           sum=sum+i;
           i++;
        }while(i<=n);
        float avg = (float)sum/n;
        System.out.println("Sum of numbers upto "+n+" is "+sum);
        System.out.println("and average is "+avg);
   }
}