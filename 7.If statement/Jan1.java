class Jan1
{
   public static void main(String [] args)
   {
       int yr = Integer.parseInt(args[0]);
       int pr = yr-1;
       int tnd = pr * 365;
       int tld = pr/4 - pr/100 + pr/400;
       int td = tnd+tld;
       int d = td%7;
       String msg = "The day on 1 January "+yr +" is ";
       if(d==0)
           msg = msg + "Monday";
       else 
            if(d==1)
                msg = msg + "Tuesday";
            else 
              if(d==2)
                  msg = msg + "Wednesday";
             else
                 if(d==3)
                    msg = msg + "Thursday";
                 else
                      if(d==4)
                          msg = msg + "Friday";
                     else
                         if(d==5)
                             msg = msg + "Saturday";
                         else
                              if(d==6)
                                 msg = msg + "Sunday";

       System.out.println(msg);         
   }
}