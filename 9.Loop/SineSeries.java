class SineSeries
{
   public static void main(String [] args)
   {
         double x = Double.parseDouble(args[0]);
         double r  = x * Math.PI/180;                         //conversion from degrees to radians
         double s = 0.0;
         int sign=1;
         for(int i=1;i<=13;i+=2)
         {
              double f=1,p=1;
              for(int j=1;j<=i;j++)
              {  
                   f  = f*j;
                   p = p*r ;
              }
            s = s + p/f *sign;
            sign = -sign;
         }
        System.out.println("Sine "+x+" = "+s);
   }
} 