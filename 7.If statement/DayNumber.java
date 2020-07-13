class DayNumber
{
   public static void main(String [] args)
   {
       int d = Integer.parseInt(args[0]);
       String msg = "The day name is ";
       if(d==1)
           msg = msg + "Monday";
       else
           if(d==2)
               msg = msg + "Tuesday";
           else
              if(d==3)
                  msg = msg + "Wednesday";
             else
                 if(d==4)
                    msg = msg + "Thursday";
                 else
                      if(d==5)
                          msg = msg + "Friday";
                     else
                         if(d==6)
                             msg = msg + "Saturday";
                         else
                              if(d==7)
                                 msg = msg + "Sunday";
                             else
                                msg = "Invalid input";

       System.out.println(msg);         
   }
}