class LeapYears
{
   public static void main(String [] args)
   {
      for(int y=1900;y<=2100;y++)
        if(y%400==0 || (y%100!=0 &&  y%4==0))
           System.out.print(y+"\t");
   }
}